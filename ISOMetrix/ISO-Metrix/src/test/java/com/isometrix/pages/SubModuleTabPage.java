package com.isometrix.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.isometrix.selenium.framework.BasePage;

public class SubModuleTabPage extends BasePage {

	public SubModuleTabPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//li[@class='active']/*[text()='Sub Module' and @class='title']")
	private WebElement subModuleTabPage;
		
	public void verifySubModuleTabPage() {
		verifyElementPresent(subModuleTabPage);
		
	}

	}
