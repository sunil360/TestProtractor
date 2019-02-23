package com.isometrix.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.isometrix.constant.GlobalConstant.FileNames;
import com.isometrix.selenium.framework.BasePage;
import com.isometrix.selenium.framework.Configuration;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}	
	
	
	@FindBy (css = ".item.logout")
	private WebElement logOut;
	
	@FindBy (xpath = "//label[text()='All Controls']")
	private WebElement allControl;
	
	public AllControlPage navigateToControlPage()
	{
		switchToFrame("ifrMain");
		clickOn(allControl);
		_waitForJStoLoad();
	    return PageFactory.initElements(getDriver(),AllControlPage.class);
	 }
	
	public AllControlPage navigateToMaintenancePage()
	{
		//clickOn(allControl);
	    return PageFactory.initElements(getDriver(),AllControlPage.class);
	 }
	
	public void logout()
	{
		clickOn(logOut);
	    
	 }
}
