package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScroll {

	WebDriver driver;

	// Store WebElemenet BY CLASS
	By COMPUTER_ACCESSORIES = By.xpath("//span[contains(text(), 'Computers & Accessories')]");
	By MONITORS = By.xpath("//button[contains(text(),'Monitors')]");
	By VIEW_ALL_MONITORS = By.xpath("//a[text() = 'View All Monitors']");


	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testMouseHover() throws InterruptedException {
			
    JavascriptExecutor js =  (JavascriptExecutor)driver;
		  js.executeScript("0, 9000");
  		  Thread.sleep(200);
      	  js.executeScript("0,0");
		
		}	
	
	
	
	
	
}
