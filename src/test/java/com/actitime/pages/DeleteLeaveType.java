package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.AutoConstant;
import com.actitime.generic.BasePage;

public class DeleteLeaveType extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "(//span[contains(text(),'Emergency Leave')])[1]/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement clickondeleteleaveLink;
	
	public DeleteLeaveType(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void deleteLeave()
	{
		visibilityofElement(driver, clickondeleteleaveLink);
		javaScriptClick(driver, clickondeleteleaveLink);
	}
}
