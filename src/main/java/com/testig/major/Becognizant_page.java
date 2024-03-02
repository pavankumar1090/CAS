package com.testig.major;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Becognizant_page {
	
 	WebDriver driver;
 	
	
	//constructor
	public Becognizant_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Webelements
	
	By profile_click1=By.xpath("//div[@id='mectrl_headerPicture']");//div[@id='mectrl_headerPicture']//div[@class='_8ZYZKvxC8bvw1xgQGSkvvA==']////div[@id='O365_HeaderRightRegion']
	
	@FindBy(xpath="(//div[@class='_8ZYZKvxC8bvw1xgQGSkvvA=='])")
	WebElement profile_click;
	@FindBy(xpath="//div[@id='mectrl_currentAccount_secondary']")
	WebElement text_id;
	
	@FindBy(xpath="//div[@id='mectrl_currentAccount_primary']")
	WebElement username_id;

	@FindBy(xpath="//span[contains(text(),'Company')]")
	WebElement dropdown_select;
	
	@FindBy(xpath="//span[contains(text(),'Acronyms')]")
	WebElement Acronyms_select;
	
	By profile_ss=By.xpath("//div[@class='mectrl_accountInfo']");
	
	
	
	
	//Action Methods
	public void profilepage() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(profile_click1)).click();
		profile_click.click();
	}
	
	public void id() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("userid is:"+text_id.getText());
		String ctsid="2303896@cognizant.com";
		Assert.assertEquals(text_id.getText(), ctsid);
	}
	
	public void name() throws IOException
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		System.out.println("username is:"+username_id.getText());
		String ctsname="Pavan Kumar, Yerragorla (Cognizant)";
		Assert.assertEquals(username_id.getText(), ctsname);
		WebElement user_ss=driver.findElement(profile_ss);
		File src=user_ss.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\2303896\\eclipse-workspace\\CAS\\Screenshots\\profile_ss.png");
		FileUtils.copyFile(src,trg);
			
	}
	
	public void select_drpdn() throws IOException
	{
		
		dropdown_select.click();
		String value2=dropdown_select.getText();
		Assert.assertEquals("Company", value2);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\2303896\\eclipse-workspace\\CAS\\Screenshots\\dropdown_ss.png"));
		
	}
	
	public void select_acronym()
	{
		WebElement button3 = Acronyms_select;
        boolean valuees = button3.isDisplayed();
        System.out.println("is the acronyms displayed ? " +valuees);
		 Acronyms_select.click();
	}
	
}
