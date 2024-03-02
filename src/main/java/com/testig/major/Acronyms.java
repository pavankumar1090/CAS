package com.testig.major;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

//import com.testing.practice.Excel;

import Utilities.Excel;

public class Acronyms {
	private static final String i = null;
	
	String file = System.getProperty ("user.dir")+"/src/main/java/Utilities/bookks.xlsx";

	WebDriver driver;
	
	public Acronyms(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(xpath="//div[@title='Acronyms']")
	WebElement Acronyms_text;
	

	By Coloumn1=By.xpath("//tbody/tr["+i+"]/td[1]");
	By Coloumn2=By.xpath("//tbody/tr["+i+"]/td[2]");
	By totalelements=By.xpath("//tbody/tr");
	
	
	
	//ActionMethods
	public void Acronyms_title()
	{
		String cts_title="Acronyms";
		Assert.assertEquals(Acronyms_text.getText(), cts_title);
	}
	public void excel() throws IOException
	{

        List<WebElement> total = driver.findElements(totalelements);
   		for(int i=1;i<=total.size();i++) {
   			String column1 = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]")).getText();
   			String column2 = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]")).getText();
   			
   			System.out.println(column1+"   "+column2);
   			
   			
   			Excel.setCellData(file,"Sheet1", i-1, 0, column1);
   			Excel.setCellData(file,"Sheet1", i-1, 1, column2);
   		}
   		
	}
		        
}
	
	
