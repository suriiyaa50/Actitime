package com.actitime.generic;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver; 
	
	@BeforeSuite
	public void executionStart()
	{
		Reporter.log("Execution Started" , true);
	}
	
	
	@BeforeClass
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver= new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get(url);
	}
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	
	@AfterSuite
	public void executionCompelted()
	{
		Reporter.log("Execution Completed" , true);
	}
}