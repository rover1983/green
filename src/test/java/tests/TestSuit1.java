package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSuit1 {

WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browserName) {
		if(browserName.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}		
	}
	
	@Test
	public void testBox() {
		driver.get("http://youtube.com");
	}
	
	@Test
	public void testBox2() {
		driver.get("http://cars.com");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

	
}
