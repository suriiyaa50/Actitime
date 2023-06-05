package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.pages.CreateNewLeaveType;
import com.actitime.pages.DeleteLeaveType;
import com.actitime.pages.HomePage_Actitme;
import com.actitime.pages.LogIn_ActiTime;

public class TestCase7 extends BaseTest
{
	@Test
	public void logintoCreateLeave() throws IOException, InterruptedException 
	{
		LogIn_ActiTime log = new LogIn_ActiTime(driver);
		log.logIn();
		HomePage_Actitme home = new HomePage_Actitme(driver);
		home.setting();
		home.leaveType();
		
		DeleteLeaveType delete = new DeleteLeaveType(driver);
		delete.deleteLeave();
	}
}