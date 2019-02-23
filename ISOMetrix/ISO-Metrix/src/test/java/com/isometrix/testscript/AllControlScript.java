package com.isometrix.testscript;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.isometrix.dataproviders.DataProviders;
import com.isometrix.pages.AllControlPage;
import com.isometrix.pages.ControlsTabPage;
import com.isometrix.pages.HomePage;
import com.isometrix.selenium.framework.BaseTest;

public class AllControlScript extends BaseTest {

	@Factory(dataProvider = "Config", dataProviderClass = DataProviders.class)
	public AllControlScript(String browser) {
		super(browser);
	}

	/*
	 * "1. Launch the browser and visit the url. 2. Enter the valid credential.
	 * 3. Click on SIGN IN button. 4. Click on All Controls button."
	 */
	@Test
	public void testRedirectAllControlScreen() throws Exception {

		reportLog("login using a valid IsoMetrix username and password.");
		HomePage homePage = loginPage.login("username", "password");

		reportLog("Go to All Control page");
		AllControlPage allControlPage = homePage.navigateToControlPage();

		reportLog("Verify All Control page");
		allControlPage.verifyAllControlPage();

	}

	/*
	 * "1. Launch the browser and visit the url. 2. Enter the valid credential.
	 * 3. Click on SIGN IN button. 4. Click on All Controls button. 5. Click on
	 * Add button right side of the screen."
	 */
	@Test
	public void testAbleToClickAddButton() throws Exception {

		reportLog("login using a valid IsoMetrix username and password.");
		HomePage homePage = loginPage.login("username", "password");

		reportLog("Go to All Control page");
		AllControlPage allControlPage = homePage.navigateToControlPage();

		reportLog("Verify All Control page");
		allControlPage.verifyAllControlPage();

		reportLog("Click on Add button on right side of Control page");
		ControlsTabPage controlsTabPage = allControlPage.ClickOnAddButton();

		reportLog("Verify Control tab is selected on Control page");
		controlsTabPage.verifyControlsTab();

	}

	/*
	 * "1. Launch the browser and visit the url. 2. Enter the valid credential.
	 * 3. Click on SIGN IN button. 4. Click on All Controls button. 5. Click on
	 * Add button right side of the screen."
	 */
	@Test
	public void testRedirectedToAddPhaseScreen() throws Exception {

		reportLog("login using a valid IsoMetrix username and password.");
		HomePage homePage = loginPage.login("username", "password");

		reportLog("Go to All Control page");
		AllControlPage allControlPage = homePage.navigateToControlPage();

		reportLog("Verify All Control page");
		allControlPage.verifyAllControlPage();

		reportLog("Click on Add button on right side of Control page");
		ControlsTabPage controlsTabPage = allControlPage.ClickOnAddButton();

		reportLog("Verify Control tab is selected on Control page");
		controlsTabPage.verifyControlsTab();

	}
}
