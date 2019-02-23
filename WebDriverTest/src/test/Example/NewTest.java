package Example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	private WebDriver driver;
	
  @Test
  public void f() {
	  driver.get("http://demo.guru99.com/selenium/guru99home/");
	  String title= driver.getTitle();
	  Assert.assertTrue(title.contains("Demo Guru99 Page"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver(); 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
