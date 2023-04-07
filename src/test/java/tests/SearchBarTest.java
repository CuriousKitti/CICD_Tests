package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchBarTest {

	WebDriver driver;
	@BeforeTest
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/snehadhande/Downloads/Software Download/chromedriver_mac_arm64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void titleTest() 
	{
		AssertJUnit.assertTrue(driver.findElement(By.name("q")).isDisplayed());  
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
