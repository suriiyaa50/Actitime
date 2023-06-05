package com.actitime.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.AutoConstant;
import com.actitime.generic.BasePage;

public class DeleteTypeofWork extends BasePage implements AutoConstant
{
	public WebDriver driver;
	public JavascriptExecutor js;
	
	@FindBy(xpath = "//a[contains(text() , 'surya')]/../..//a[contains(text() , 'delete')]")
	private WebElement deleteLink;
	
	public DeleteTypeofWork(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void deleteTypeWork()
	{
		visibilityofElement(driver, deleteLink);
		javaScriptClick(driver, deleteLink);
		driver.switchTo().alert().accept();
	}
}
