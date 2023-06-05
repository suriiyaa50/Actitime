package com.actitime.generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	//WebDriver Interfaces All UserDefined Method

	public void validateTitle(WebDriver driver, String ExpectedTitle)
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle, "Both Title are Not Matching");
		Reporter.log("Both the Title are matching" , true);
	}

	public void ValidateUrl(WebDriver driver , String expectedUrl)
	{
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Both the URL are not Matching");
		Reporter.log("Both the URL are Matching"  , true);
	}
	//have to write remaining method of WebDriver Interface

	//Select Classes All Methods

	public void selectByText(WebElement element , String text )
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	//have to write remaining method of Select Class

	//Actions Class
	public void moveToElement(WebDriver driver, WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
	}

	//have to write remaining method of Select Class

	//Robot Class

	public void robotoEnter() throws AWTException, InterruptedException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	//have to write remaining method of Robot Class

	//webdriverWait Interface

	public void visibilityofElement(WebDriver driver , WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void visibilityofAllElements(WebDriver driver , WebElement elements)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}

	public void titleIs(WebDriver driver , String title)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(title));
	}

	public void urlIs(WebDriver driver , String url)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.urlContains(url));
	}


	//have to write remaining method of webdriverWait Interface

	//JavaScriptExecutor

	public void javaScriptClick(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	
	public void javascriptEnterValue(WebDriver driver, String enterValue , WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(enterValue, element);
	}

	public void scrollIntoView(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	//have to write remaining method of javascript Executor

	//Alert Interface

	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
}