package com.isometrix.testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.isometrix.constant.GlobalConstant.FileNames;
import com.isometrix.dataproviders.DataProviders;
import com.isometrix.pages.AllControlPage;
import com.isometrix.pages.HomePage;
import com.isometrix.pages.LoginPage;
import com.isometrix.selenium.framework.BaseTest;
import com.isometrix.selenium.framework.Configuration;

public class IsometrixTest extends BaseTest {

	@Factory(dataProvider = "Config", dataProviderClass = DataProviders.class)
	public IsometrixTest(String browser) {
		super(browser);
	}

	@Test
	public void testAddModule() throws Exception {

		// read test data from properties file
		Configuration propertyReader = new Configuration(FileNames.TestdataProperties.toString());
		String controlLevel = propertyReader.readApplicationData("controlLevel");
		String controlView = propertyReader.readApplicationData("controlView");
		String controlTextbox = propertyReader.readApplicationData("controlTextbox");
		String controlDefatultTextbox = propertyReader.readApplicationData("controlDefaultTextbox");
		String controlTextArea = propertyReader.readApplicationData("controlTextArea");
		String controlNumeric1 = propertyReader.readApplicationData("controlNumeric1");
		String controlNumeric2 = propertyReader.readApplicationData("controlNumeric2");
		String controlDate1 = propertyReader.readApplicationData("controlDate1");
		String controlDate2 = propertyReader.readApplicationData("controlDate2");
		String controlTime1 = propertyReader.readApplicationData("controlTime1");
		String controlTime2 = propertyReader.readApplicationData("controlTime2");
		String controlChkbox = propertyReader.readApplicationData("controlChkbox");
		String controlFormula = propertyReader.readApplicationData("controlFormula");
		String controlDatalabel = propertyReader.readApplicationData("controlDatalabel");
		String controlLookup = propertyReader.readApplicationData("controlLookup");
		String userdefinedCBL1 = propertyReader.readApplicationData("userdefinedCBL1");
		String userdefinedCBL2 = propertyReader.readApplicationData("userdefinedCBL2");
		String userdefinedDDL1 = propertyReader.readApplicationData("userdefinedDDL1");
		String userdefinedDDL2 = propertyReader.readApplicationData("userdefinedDDL2");
		String mdsDDL1 = propertyReader.readApplicationData("mdsDDL1");
		String mdsDDL2 = propertyReader.readApplicationData("mdsDDL2");
		String mdsDDL3 = propertyReader.readApplicationData("mdsDDL3");
		String mdsCBL1 = propertyReader.readApplicationData("mdsCBL1");
		String mdsCBL2 = propertyReader.readApplicationData("mdsCBL2");
		String mdsCBL3 = propertyReader.readApplicationData("mdsCBL3");
		String mhdsDDL1 = propertyReader.readApplicationData("mhdsDDL1");
		String mhdsDDL2 = propertyReader.readApplicationData("mhdsDDL2");
		String mhdsDDL3 = propertyReader.readApplicationData("mhdsDDL3");
		String mhdsCBL1 = propertyReader.readApplicationData("mhdsCBL1");
		String mhdsCBL2 = propertyReader.readApplicationData("mhdsCBL2");
		String userUsers = propertyReader.readApplicationData("userUsers");
		String userList = propertyReader.readApplicationData("userList");

		HomePage homePage = PageFactory.initElements(getWebDriver(), HomePage.class);

		// User is required to login using a valid IsoMetrix username and
		// password.
		reportLog("User is required to login using a valid IsoMetrix username and password.");
		loginPage.login("username", "password");

		// The user will have access to the All controls interface and will have
		// access to the All Controls module as well as the Maintenance module.
		reportLog("The user will have access to the All controls interface and will have");
		AllControlPage allControlPage = PageFactory.initElements(getWebDriver(), AllControlPage.class);
		allControlPage.selectAllControl();

		// The user will be able to select the [Add New]
		reportLog("The user will be able to select the [Add New] button on the All controls module");
		allControlPage.addentry();

		// The user will be required to fill in all the mandatory fields and
		// should then be able to save the record successfully.
		allControlPage.addentryControls(controlLevel, controlView, controlTextbox, controlDefatultTextbox,
				controlTextArea, controlNumeric1, controlNumeric2, controlDate1, controlDate2, controlTime1,
				controlTime2, controlChkbox, controlFormula, controlDatalabel, controlLookup);
		allControlPage.addentry_Userdefined(new String[] { userdefinedCBL1 }, new String[] { userdefinedCBL2 },
				userdefinedDDL1, userdefinedDDL2);
		allControlPage.addentryMDS(mdsDDL1, mdsDDL2, new String[] { mdsCBL1 }, new String[] { mdsCBL2 }, mdsDDL3,
				new String[] { mdsCBL3 });
		allControlPage.addentryMHDS(mhdsDDL1, mhdsDDL2, mhdsDDL3, new String[] { mhdsCBL1 }, new String[] { mhdsCBL2 });
		allControlPage.addentryUser(userUsers, new String[] { userList });

		// The user will be able to add data to the new blank sub module record
		// and [Save] without errors.
		reportLog("The user will be able to add data to the new blank sub module record and and [Save] without errors ");
		allControlPage.clickOnSave();
		
		//capture record id		
		String recordID = allControlPage.captureAddedRecordID();
		reportLog("capture record id : " + recordID);
		
		//click on close icon
		reportLog("click on close icon");
		allControlPage.clickOnCloseIcon();
		
		//verify record added successfully
		reportLog("verify record added successfully");
		boolean status  = allControlPage.checkRecordNumberInList(recordID);
		Assert.assertTrue(status, "Record Saved successfully");

	}
}
