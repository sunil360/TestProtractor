package com.isometrix.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.isometrix.selenium.framework.BasePage;

public class MHDSTabPage extends BasePage {

	public MHDSTabPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//li[@class='active']/*[text()='MHDS' and @class='title']")
	private WebElement mhdsTabPage;
		
	public void verifyMHDSTabPage() {
		verifyElementPresent(mhdsTabPage);
		
	}
	
	@FindBy(css = "#control_207F63FB-4EF5-419D-A6F6-8DE6BBE968CE")
	WebElement mhds_ddl1_dropdown;
	@FindBy(css = "#divForms>div:nth-child(10)>div>input")
	WebElement mhds_ddl1_search;
	@FindBy(css = "#control_B6304480-1CC9-4375-B856-8C4D097ADF0F")
	WebElement mhds_ddl2_dropdown;
	@FindBy(css = "#divForms>div:nth-child(11)>div>input")
	WebElement mhds_ddl2_search;
	@FindBy(css = "#control_04FA9482-231E-4A09-A104-C376E29F5C38>div>div>div>input")
	WebElement mhds_cbl1_search;
	@FindBy(css = "#control_26482219-7E7E-491D-907C-DB5616D84981>div>div>div>input")
	WebElement mhds_cbl2_search;
	@FindBy(css = "#control_77110266-ED6F-455E-A267-323E328ECA83")
	WebElement mhds_ddl3_dropdown;
	@FindBy(css = "#divForms>div:nth-child(12)>div>input")
	WebElement mhds_ddl3_search;
	
	
	public void mHDS_DDL1(String text) {
		clickOn(mhds_ddl1_dropdown);
		sleep(2000);
		try {
			clickOn(mhds_ddl1_search);
		} catch (StaleElementReferenceException ex) {
			clickOn(mhds_ddl1_search);
		}
	}
	
	
	public void mHDS_DDL2(String text) {
		clickOn(mhds_ddl2_dropdown);
		sleep(2000);
		try {
			clickOn(mhds_ddl2_search);
		} catch (StaleElementReferenceException ex) {
			clickOn(mhds_ddl2_search);
		}
	}
	
	
	
	public void mHDS_DDL3(String text) {
		clickOn(mhds_ddl3_dropdown);
		sleep(2000);
		try {
			clickOn(mhds_ddl3_search);
		} catch (StaleElementReferenceException ex) {
			clickOn(mhds_ddl3_search);
		}
	}
	
	@FindBy(xpath = "//*[@id='control_04FA9482-231E-4A09-A104-C376E29F5C38']/div[1]/a/span[2]/b[1]")
	WebElement mhds_cbl1;
	
	public void enterAllFieldOnMHDSTab() throws Exception {
		  
		  mHDS_DDL1("Test 2");
		  mHDS_DDL2("Test 2");
		  mHDS_DDL3("Test 2");
		  clickOn(mhds_cbl1);		  
		 
}
	
	}
