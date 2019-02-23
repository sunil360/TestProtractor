package com.isometrix.testscript;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.isometrix.dataproviders.DataProviders;
import com.isometrix.pages.AllControlPage;
import com.isometrix.pages.ControlsTabPage;
import com.isometrix.pages.HomePage;
import com.isometrix.pages.MHDSTabPage;
import com.isometrix.pages.SubModuleTabPage;
import com.isometrix.pages.UserDefinedTabPage;
import com.isometrix.selenium.framework.BaseTest;

public class SubModuleTabScript extends BaseTest {

 @Factory(dataProvider = "Config", dataProviderClass = DataProviders.class)
 public SubModuleTabScript(String browser) {
  super(browser);

 }
/*AM_054
 "1. Launch the browser and visit the url.
 2. Enter the valid credential.
 3. Click on SIGN IN button.
 4. Click on All Controls button.
 5. Click on Add button right side of the screen.
 6. Click on Sub Module tab.
 7. Verify Sub Module tab."
*/ 
 @Test
 public void testVerifyRedirectedToSubModuleTabScreen() throws Exception {

  reportLog("login using a valid IsoMetrix username and password.");
  HomePage homePage = loginPage.login("username", "password");

  reportLog("Go to All Control page");
  AllControlPage allControlPage = homePage.navigateToControlPage();

  reportLog("Verify All Control page");
  allControlPage.verifyAllControlPage();

  reportLog("Click on Add button on right side of Control page");
  allControlPage.ClickOnAddButton();

  reportLog("Click on Sub Module tab");
  SubModuleTabPage subModuleTabPage = allControlPage.navigateToSubModuleTab();
  
  reportLog("Verify Sub Module tab is selected on Sub Module page");
  subModuleTabPage.verifySubModuleTabPage();

 }
 
 /* AM_055
 "1. Launch the browser and visit the url.
 2. Enter the valid credential.
 3. Click on SIGN IN button.
 4. Click on All Controls button.
 5. Click on Add button right side of the screen.
 6. Click on Sub Module tab.
 7. Leave all field blank in previous tab.
 8. Click on Save button."
*/

 @Test
 public void testVerifyWithoutFillingPreviousTabFieldsErrorMessageOfControlFieldsOnSubModule() throws Exception {

  reportLog("login using a valid IsoMetrix username and password.");
  HomePage homePage = loginPage.login("username", "password");

  reportLog("Go to All Control page");
  AllControlPage allControlPage = homePage.navigateToControlPage();

  reportLog("Click on Add button on right side of Control page");
  allControlPage.ClickOnAddButton();

  reportLog("Click on Sub Module tab");
  allControlPage.navigateToSubModuleTab();
  
  reportLog("Click on Save button on right the side");
  allControlPage.clickOnSaveButton();
  
  reportLog("Verify All Control page");
  allControlPage.verifyAllControlPage();

 }

}