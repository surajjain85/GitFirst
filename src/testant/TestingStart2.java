package testant;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingStart2 {
	WebDriver driver;
	
@BeforeMethod
public void open(){
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Files\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://www.gmail.com/");
}

@Test
public void testmain(){
	driver.getTitle();
}

@AfterMethod
public void close(){
	driver.quit();
}

}
