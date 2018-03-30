package testant;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FEBTWELVE {
WebDriver driver;
	@BeforeMethod
	public void open(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Files\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.co.in");
	}
	
	@Test
	public void testmain(){
		driver.findElement(By.id("lst-ib")).sendKeys("test");
	}
	
	@AfterMethod
	public void close(){
		
	}
}
