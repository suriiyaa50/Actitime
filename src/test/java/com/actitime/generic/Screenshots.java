package com.actitime.generic;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshots implements ITestListener
{
	public void onTestFailuare(ITestResult result) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) BaseTest.driver;	
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile= new File("./FailedScreenShot/failed.png");
		FileHandler.copy(srcFile, destFile);
	}
}