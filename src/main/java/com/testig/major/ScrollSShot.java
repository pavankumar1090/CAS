package com.testig.major;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ScrollSShot {
	
	
WebDriver driver;
 	
	
	//constructor
	public ScrollSShot(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//span[@id='id__13']")
	WebElement becognizant;
	
	public void screenshot() throws IOException
	{
	int i=1;
	while(i<=244) {


	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement acronym=driver.findElement(By.xpath("//tr["+i+"]"));
	js.executeScript("arguments[0].scrollIntoView();",acronym);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File("C:\\Users\\2303896\\eclipse-workspace\\CAS\\Scrrenshots\\Acronym"+i+".png");
	FileUtils.copyFile(src,trg);
	i=i+9;
	
	}
	}
	public  void home_back () throws InterruptedException 
	{
	becognizant.click();
	Thread.sleep(5000);
	String ss=driver.getTitle();
	Assert.assertEquals("Be.Cognizant - Home", ss);
	}
  }