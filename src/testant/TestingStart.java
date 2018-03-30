package testant;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingStart {
	WebDriver driver;
	
@BeforeMethod
public void open(){
	System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Selenium Files\\IEDriverServer.exe");
	driver= new InternetExplorerDriver();
	driver.get("https://www.facebook.com/");
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
