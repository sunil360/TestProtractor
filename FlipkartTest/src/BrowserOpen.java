import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpen {
	@Test
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver","/home/ubuntu/workspace/FlipkartTest/Jars/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.close();
		
	}

}
