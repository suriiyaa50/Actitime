package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.AutoConstant;
import com.actitime.generic.BasePage;

public class Task_ActiTime extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "//div[contains(text() , 'Add New')]")
	private WebElement ClickOnaddnewLink;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement clickonNewCustomer;
	
	@FindBy(xpath = "//div[@class='item createNewProject']")
	private WebElement clickonNewProject;
	
	public Task_ActiTime(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	public void addnew()
	{
		visibilityofElement(driver, ClickOnaddnewLink);
		javaScriptClick(driver, ClickOnaddnewLink);
	}
	
	public void NewCustomer() throws InterruptedException
	{
		visibilityofElement(driver, clickonNewCustomer);
		javaScriptClick(driver, clickonNewCustomer);
		Thread.sleep(3000);
	}
	
	public void createNewProject()
	{
		visibilityofElement(driver, clickonNewProject);
		javaScriptClick(driver, clickonNewProject);
	}
}
