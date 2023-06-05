package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.pages.DeleteCustomer;
import com.actitime.pages.HomePage_Actitme;
import com.actitime.pages.LogIn_ActiTime;


public class TestCase3 extends BaseTest
{
	@Test
	public void loginLogOutDeleteCustomer() throws IOException, InterruptedException
	{
		LogIn_ActiTime loginpage = new LogIn_ActiTime(driver);
		loginpage.logIn();
		
		HomePage_Actitme homepage = new HomePage_Actitme(driver);
		homepage.titleValidate();
		homepage.urlValidate();
		homepage.task();
		
		DeleteCustomer delete=new DeleteCustomer(driver);
		delete.clickonSurya();
		delete.clickonsetting();
		delete.clickonactionTab();
		delete.delete();
		delete.deletePermanentButton();
		Thread.sleep(2000);
		homepage.logout();
	}
}
