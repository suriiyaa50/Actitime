package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.pages.HomePage_Actitme;
import com.actitime.pages.LogIn_ActiTime;


public class TestCase1 extends BaseTest
{
	@Test
	public void loginLogOut() throws IOException, InterruptedException
	{
		LogIn_ActiTime loginpage = new LogIn_ActiTime(driver);
		loginpage.logIn();
		
		HomePage_Actitme homepage = new HomePage_Actitme(driver);
		homepage.titleValidate();
		homepage.urlValidate();
		
		homepage.logout();
	}
}
