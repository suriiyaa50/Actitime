package com.actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.AutoConstant;
import com.actitime.generic.BasePage;
import com.actitime.generic.ExcelLibrary;
import com.actitime.generic.UtilityClass;

public class LogIn_ActiTime extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameTextfield;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//input[@id='keepLoggedInCheckBox']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement loginButton;
	
	public LogIn_ActiTime(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void logIn() throws IOException, InterruptedException
	{
		UtilityClass.highlightElement(driver, usernameTextfield);
		visibilityofElement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(excelSheetName, 1, 0));
		
		UtilityClass.highlightElement(driver, passwordTextfield);
		visibilityofElement(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excelSheetName, 1, 1));
		
		visibilityofElement(driver, checkbox);
		javaScriptClick(driver, checkbox);
		
		visibilityofElement(driver, loginButton);
		javaScriptClick(driver, loginButton);
	}
}

























