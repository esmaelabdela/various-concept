package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	
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
	public void testMouseHover() {
			
     Actions action = new Actions(driver);
     action.moveToElement(driver.findElement(COMPUTER_ACCESSORIES)).build().perform();
     action.moveToElement(driver.findElement(MONITORS)).build().perform();
     driver.findElement(VIEW_ALL_MONITORS).click();
     
		}	
}
