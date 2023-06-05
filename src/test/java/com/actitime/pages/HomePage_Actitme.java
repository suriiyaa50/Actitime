package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.AutoConstant;
import com.actitime.generic.BasePage;

public class HomePage_Actitme extends BasePage implements AutoConstant
{
	public WebDriver driver;

	@FindBy(xpath = "//a[@id='logoutLink']")
	private WebElement logoutlink;
	
	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement clickonTaskLink;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement clickonSettings;
	
	@FindBy(xpath = "//a[contains(text() , 'Types of Work')]")
	private WebElement clickonTypesofWork;
	
	@FindBy(xpath = "//span[contains(text() , 'Create Type of Work')]")
	private WebElement clickonCreateTypeofWork;
	
	@FindBy(xpath = "//a[contains(text(), 'Leave Types')]")
	private WebElement clickonLeaveTypeofWork;
	
	@FindBy(xpath = "//span[contains(text(), 'Create Leave Type')]")
	private WebElement clickonCreateLeaveType;
	

	public HomePage_Actitme(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void titleValidate()
	{
		titleIs(driver, "actiTIME - Enter Time-Track");
		validateTitle(driver, "actiTIME - Enter Time-Track" );
	}
	
	public void urlValidate()
	{
		urlIs(driver,"https://demo.actitime.com/user/submit_tt.do");
		ValidateUrl(driver, "https://demo.actitime.com/user/submit_tt.do");
	}
	
	public void logout()
	{
		visibilityofElement(driver, logoutlink);
		javaScriptClick(driver, logoutlink);
	}
	
	public void task()
	{
		visibilityofElement(driver, clickonTaskLink);
		javaScriptClick(driver, clickonTaskLink);
	}
	
	public void setting()
	{
		visibilityofElement(driver, clickonSettings);
		javaScriptClick(driver, clickonSettings);
	}
	
	public void typeOfWork()
	{
		visibilityofElement(driver, clickonTypesofWork);
		javaScriptClick(driver, clickonTypesofWork);
	}
	
	public void createTypeOfWork()
	{
		visibilityofElement(driver, clickonCreateTypeofWork);
		javaScriptClick(driver, clickonCreateTypeofWork);
	}
	
	public void leaveType()
	{
	visibilityofElement(driver, clickonLeaveTypeofWork);
	javaScriptClick(driver, clickonLeaveTypeofWork);
	}
	
	public void createLeaveType()
	{
		visibilityofElement(driver, clickonCreateLeaveType);
		javaScriptClick(driver, clickonCreateLeaveType);
	}
}