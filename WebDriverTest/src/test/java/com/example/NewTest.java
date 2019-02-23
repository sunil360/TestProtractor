package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NewExample {

	
	private WebDriver driver;
	
	
  @Test
  public void f() {
	  
	  driver.get("http://demo.guru99.com/selenium/guru99home/");
	  String title= driver.getTitle();
	  System.out.println(title);
	  Assert.assertTrue(title.contains("Demo Guru99 Page"));
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","/home/ubuntu/workspace/WebDriverTest/src/test/resources/WebDriver/geckodriver");
	  driver = new FirefoxDriver(); 
	  System.out.println("Browser Opened");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
	  System.out.println("Browser has been closed");
  }

}




