package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.AutoConstant;
import com.actitime.generic.BasePage;

public class CreateCustomer_ActiTime extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterCustomerName;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement CustomerDescription; 
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createCustomerButton;

	public CreateCustomer_ActiTime(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public  void createnewCustomer() throws InterruptedException
	{
		visibilityofElement(driver, EnterCustomerName);
		javascriptEnterValue(driver, "arguments[0].value='surya' ", EnterCustomerName);
		Thread.sleep(3000);
	}
	
	public void customerDescription() throws InterruptedException 
	{
		visibilityofElement(driver, CustomerDescription);
		javascriptEnterValue(driver, "arguments[0].value='Description have to write' ", CustomerDescription);
	    Thread.sleep(3000);
	}
	
	public void createCustomerButton() throws InterruptedException
	{
		visibilityofElement(driver, createCustomerButton);
		javaScriptClick(driver, createCustomerButton);
	}
}
