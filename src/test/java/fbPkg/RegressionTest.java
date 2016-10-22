package fbPkg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RegressionTest {
	
	public static WebDriver driver;
	
  @Test
  public void Regression_TestCase01() {
	  
	  
	  String title = driver.getTitle();
	  System.out.println(title);
  }
  @BeforeMethod
  public static void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("http://facebook.com");
	  
  }

  @AfterMethod
  public static void afterMethod() {
	  driver.close();
  }

}
