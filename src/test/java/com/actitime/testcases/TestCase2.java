package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generic.BaseTest;
import com.actitime.pages.CreateCustomer_ActiTime;
import com.actitime.pages.HomePage_Actitme;
import com.actitime.pages.LogIn_ActiTime;
import com.actitime.pages.Task_ActiTime;

public class TestCase2 extends BaseTest
{
	@Test
	public void loginToCreateCustomer() throws IOException, InterruptedException
	{
		LogIn_ActiTime loginpage = new LogIn_ActiTime(driver);
		loginpage.logIn();
		
		HomePage_Actitme homepage = new HomePage_Actitme(driver);
		homepage.titleValidate();
		homepage.urlValidate();
		homepage.task();
		
		Task_ActiTime task= new Task_ActiTime(driver);
		task.addnew();
		task.NewCustomer();
		
		CreateCustomer_ActiTime customer= new CreateCustomer_ActiTime(driver);
		customer.createnewCustomer();
		customer.customerDescription();
		customer.createCustomerButton();
		Thread.sleep(2000);
		homepage.logout();
	}
}
