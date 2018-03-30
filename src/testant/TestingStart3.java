package testant;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingStart3 {
	WebDriver driver;
	
@BeforeMethod
public void open(){
	//System.setProperty("webdriver.Firefox.driver", "D:\\Selenium\\Selenium Files\\geckodriver.exe");
	driver= new FirefoxDriver();
	driver.get("http://www.snapdeal.com/");
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
