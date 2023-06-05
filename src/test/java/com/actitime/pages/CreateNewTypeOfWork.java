package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.AutoConstant;
import com.actitime.generic.BasePage;

public class CreateNewTypeOfWork extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement entername;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitLink;
	
	public CreateNewTypeOfWork(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterName()
	{
		visibilityofElement(driver, entername);
		javascriptEnterValue(driver, "arguments[0].value='surya' ", entername);
	}
	
	public void submit()
	{
		visibilityofElement(driver, submitLink);
		javaScriptClick(driver, submitLink);
	}	
}