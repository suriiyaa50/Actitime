package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.AutoConstant;
import com.actitime.generic.BasePage;

public class DeleteCustomer extends BasePage implements AutoConstant
{
	public WebDriver driver;

	@FindBy(xpath = "(//div[contains(text() , 'surya')])[1]")
	private WebElement clickonsurya;
	
	@FindBy(xpath = "//div[@title='surya']/..//div[@class='editButton']")
	private WebElement clickonsetting;

	@FindBy(xpath = "(//div[@class='action'])[1]")
	private WebElement actionstab;
	
	@FindBy(xpath = "(//div[.='Delete'])[2]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "(//span[@class='submitTitle buttonTitle'])[1]")
	private WebElement deletepermanentbutton;
	
	public DeleteCustomer(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void clickonSurya()
	{
		scrollIntoView(driver, clickonsurya);
		visibilityofElement(driver, clickonsurya);
		javaScriptClick(driver, clickonsurya);
	}
	
	public void clickonsetting()
	{
		visibilityofElement(driver, clickonsetting);
		javaScriptClick(driver, clickonsetting);
	}

	public void clickonactionTab()
	{
		visibilityofElement(driver, actionstab);
		javaScriptClick(driver, actionstab);
	}
	
	public void delete() throws InterruptedException
	{
		visibilityofElement(driver, deleteButton);
		javaScriptClick(driver, deleteButton);
	}
	
	public void deletePermanentButton()
	{
		visibilityofElement(driver, deletepermanentbutton);
		javaScriptClick(driver, deletepermanentbutton);
	}
}