package com.isometrix.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.isometrix.selenium.framework.BasePage;

public class MDSTabPage extends BasePage {

	public MDSTabPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//li[@class='active']/*[text()='MDS' and @class='title']")
	private WebElement mdsTabPage;
		
	public void verifyMDSTabPage() {
		verifyElementPresent(mdsTabPage);
		
	}
	//#control_7A7F4CBC-FEF4-48A9-B850-FC89A5E4F5C3>div[1]>a>span[2]>b[1]
	
	@FindBy(css = "#control_91B2F73A-3690-43FE-940D-552056B22E51")
	WebElement mds_ddl1_dropdown;
	@FindBy(xpath = "(//*[@id='e0fa2146-636b-4b28-b805-e9bc21d9de67_anchor'])[3]")
	WebElement mds_ddl1_search;
	@FindBy(css = "#control_92856A7D-0F66-41FA-9454-A91E2ED28C4F")
	WebElement mds_ddl2_dropdown;
	@FindBy(xpath = "(.//*[@id='535f0a52-7b87-4d22-bb5a-84c5e335df5e_anchor'])[7]")
	WebElement mds_ddl2_search;
	@FindBy(css = "#control_7A7F4CBC-FEF4-48A9-B850-FC89A5E4F5C3>div>div>div>input")
	WebElement mds_cbl1_search;
	@FindBy(css = "#control_3A79E59D-A99F-4D58-8A76-EF667EEAE8F6>div>div>input")
	WebElement mds_cbl2_search;
	@FindBy(css = "#control_4914C465-BED7-4FAD-95E2-35F0FE4C854B")
	WebElement mds_ddl3_dropdown;
	@FindBy(xpath = "(.//*[@id='86e2ef27-347b-4418-a14b-c6eb59a83f3e_anchor'])[8]")
	WebElement mds_ddl3_search;
	@FindBy(css = "")
	WebElement mds_cbl3_search;

	public void mDS_DDL1(String text) {
		clickOn(mds_ddl1_dropdown);
		sleep(2000);
		try {
			clickOn(mds_ddl1_search);
		} catch (StaleElementReferenceException ex) {
			clickOn(mds_ddl1_search);
		}
	}
	
	
	public void mDS_DDL2(String text) {
		clickOn(mds_ddl2_dropdown);
		sleep(2000);
		try {
			clickOn(mds_ddl2_search);
		} catch (StaleElementReferenceException ex) {
			clickOn(mds_ddl2_search);
		}
	}
	
	
	
	public void mDS_DDL3(String text) {
		clickOn(mds_ddl3_dropdown);
		sleep(2000);
		try {
			clickOn(mds_ddl3_search);
		} catch (StaleElementReferenceException ex) {
			clickOn(mds_ddl3_search);
		}
	}
	
	@FindBy(xpath="((//*[@id='86e2ef27-347b-4418-a14b-c6eb59a83f3e_anchor'])[1]/i[1]")
	private WebElement mds_cbl1;
	
	@FindBy(xpath="(.//*[@id='535f0a52-7b87-4d22-bb5a-84c5e335df5e_anchor'])[2]/i[1]")
	private WebElement mds_cbl2;
	
	@FindBy(xpath="(.//*[@id='86e2ef27-347b-4418-a14b-c6eb59a83f3e_anchor'])[3]/i[1]")
	private WebElement mds_cbl3;
	
	public void enterAllFieldOnMDSTab() throws Exception {
		/*String cbl1 = propertyReader.readApplicationData("mdsCBL1");
		String cbl2 = propertyReader.readApplicationData("mdsCBL2");
		String cbl3 = propertyReader.readApplicationData("mdsCBL3");*/
		mDS_DDL1("Test");
		mDS_DDL2("Test that");
		javascriptButtonClick(mds_cbl1);
		javascriptButtonClick(mds_cbl2);
		
		mDS_DDL3("12121");
		
		/*inputText(mds_cbl1_search, cbl1);
		inputText(mds_cbl2_search, cbl2);
		inputText(mds_cbl1_search, cbl3);*/
		
		javascriptButtonClick(mds_cbl3);  
		}
	}
