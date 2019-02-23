package com.isometrix.testscript;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.isometrix.dataproviders.DataProviders;
import com.isometrix.selenium.framework.BaseTest;

public class LoginScript extends BaseTest{

	@Factory(dataProvider = "Config", dataProviderClass = DataProviders.class)
	public LoginScript(String browser) {
		super(browser);
	}

	@Test
	public void testValidLogin() throws Exception {
		
		reportLog("User is required to login using a valid IsoMetrix username and password.");
		loginPage.login("username", "password");
		
		reportLog("Verify user is not logged in using valid username and valid password of IsoMetrix.");
		loginPage.verifyLogin();
	}
	
	@Test
	public void testLoginWithInValidPassword() throws Exception {
		
		reportLog("Login using a valid username and invalid password of IsoMetrix.");
		loginPage.login("username","invalidPassword");
		
		reportLog("Verify user is not logged in using valid username and invalid password of IsoMetrix.");
		loginPage.verifyInvalidLogin();
	}
	
	@Test
	public void testLoginWithInValidUserName() throws Exception {
		
		reportLog("Login using a invalid username and valid password of IsoMetrix.");
		loginPage.login("invalidUserName","password");
		
		reportLog("Verify user is not logged in using invalid username and valid password of IsoMetrix.");
		loginPage.verifyInvalidLogin();
	}
	
	@Test
	public void testLoginWithBlank() throws Exception {
		
		reportLog("Login using a blank username and blank password of IsoMetrix.");
		loginPage.login("userBlank","passwordBlank");
		
		reportLog("Verify user is not logged in using blank username and blank password of IsoMetrix.");
		loginPage.verifyInvalidLogin();
	}
	
}
