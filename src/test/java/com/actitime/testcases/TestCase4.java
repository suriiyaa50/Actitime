package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.pages.CreateNewTypeOfWork;
import com.actitime.pages.HomePage_Actitme;
import com.actitime.pages.LogIn_ActiTime;


public class TestCase4 extends BaseTest
{
	@Test
	public void CreateTypeofWork() throws IOException, InterruptedException
	{
		LogIn_ActiTime log = new LogIn_ActiTime(driver);
		log.logIn();
		HomePage_Actitme home = new HomePage_Actitme(driver);
		home.setting();
		home.typeOfWork();
		home.createTypeOfWork();
		
		CreateNewTypeOfWork object= new CreateNewTypeOfWork(driver);
		
		object.enterName();
		object.submit();
		
	}
}
