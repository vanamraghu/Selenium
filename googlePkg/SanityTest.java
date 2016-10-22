package googlePkg;

import org.testng.annotations.Test;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class SanityTest {
	
	public static WebDriver driver;

  @Test
  public void Sanity_TC01() {
	  String title = driver.getTitle();
	  System.out.println(title);
  }
  @BeforeMethod
  public static void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("http://google.com");
	
  }

  @AfterMethod
  public static void afterMethod() {
	  driver.close();
	  
  }

}
