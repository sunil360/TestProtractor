package com.isometrix.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.isometrix.selenium.framework.BasePage;

public class UsersTabPage extends BasePage {

	public UsersTabPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//li[@class='active']/*[text()='Users' and @class='title']")
	private WebElement usersTabPage;
		
	public void verifyUsersTabPage() {
		verifyElementPresent(usersTabPage);
		
	}
	

	
	}
