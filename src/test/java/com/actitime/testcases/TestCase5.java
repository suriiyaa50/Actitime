package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.pages.DeleteTypeofWork;
import com.actitime.pages.HomePage_Actitme;
import com.actitime.pages.LogIn_ActiTime;

public class TestCase5 extends BaseTest 
{
	@Test
	public void loginTodeleteTypeofWork() throws IOException, InterruptedException
	{
		LogIn_ActiTime log = new LogIn_ActiTime(driver);
		log.logIn();
		HomePage_Actitme home = new HomePage_Actitme(driver);
		home.setting();
		home.typeOfWork();
		
		DeleteTypeofWork deletework = new DeleteTypeofWork(driver);
		deletework.deleteTypeWork();
	}
}
