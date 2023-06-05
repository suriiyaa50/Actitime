package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.AutoConstant;
import com.actitime.generic.BasePage;

public class CreateNewLeaveType extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Leave Type Name']")
	private WebElement enterLeaveTypeName;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement clickonCheckBox;
	
	@FindBy(xpath = "//span[contains(@class , 'buttonTitle')]")
	private WebElement submit;
	
	
	public CreateNewLeaveType(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterLeaveTypeName()
	{
		visibilityofElement(driver, enterLeaveTypeName);
		javascriptEnterValue(driver, "arguments[0].value='Emergency Leave'", enterLeaveTypeName);
	}
	
	public void clickonCheckBox()
	{
		visibilityofElement(driver, clickonCheckBox);
		javaScriptClick(driver, clickonCheckBox);
	}
	public void submit()
	{
		visibilityofElement(driver, submit);
		javaScriptClick(driver, submit);
	}
}
