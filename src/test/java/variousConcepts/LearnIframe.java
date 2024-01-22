package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIframe {

	WebDriver driver;

	// Store WebElemenet BY CLASS
	By USERNAME_FIELD = By.xpath("//input[@id='user_name']");
	By PASSWORD_FIELD = By.xpath("//input[@id='password']");
	By SIGNIN_BUTTON_FIELD = By.xpath("//button[@id='login_submit']");
	By DASHBOARD_HEADER_FIELD = By.xpath("//span[contains(text() ,'Dashboard')]");
	

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/login");
	  //  driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {
		driver.findElement(USERNAME_FIELD).sendKeys("demo@codefios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
		driver.findElement(SIGNIN_BUTTON_FIELD).click();
		 
        // dealing with Nested Frame/child frame
		driver.switchTo().frame("advertisement");
		driver.findElement(By.xpath("//*[@id=\"ad_one\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ad_three\"]")).click();
		
		driver.switchTo().frame("portals");
		driver.findElement(By.xpath("//*[@id=\"portal_one\"]/div/a/img")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("advertisement");
		driver.findElement(By.xpath("//*[@id=\"ad_three\"]")).click();
		}	
	
		
//	@Test
   public void Frame () {
	 
	   driver.switchTo().frame("packageListFrame"); 
	   driver.findElement(By.linkText("java.awt")).click();
	   
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame("packageFrame");
	   driver.findElement(By.linkText("Adjustable")).click();
   }
   
        
	
	
}
