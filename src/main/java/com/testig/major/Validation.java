package com.testig.major;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Validation{
	WebDriver driver;
	
	public Validation(WebDriver driver)
	{
		this.driver=driver;
//		PageFactory.initElements(driver,this);
	}
	
	

	By login_username=By.xpath("//input[@id='i0116']");
	
	By login_username_click=By.xpath("//*[@id='idSIButton9']");
	
	By login_password=By.id("i0118");
	
	By login_password_click=By.xpath("//input[@value='Sign in']");
	
	By wait=By.xpath("//*[@id='KmsiCheckboxField']");
	
	By stay_signedin_click=By.xpath("//*[@id='idSIButton9']");
	
	
	//ActionMethods
	public void setUsername(String username,String password)
	{
		try {
    		driver.findElement(login_username).sendKeys(username);
    		driver.findElement(login_username_click).click();
    		}
        catch(Exception e) {
    		}
    	
        try {
        	
        	driver.findElement(login_password).sendKeys(password);
        	driver.findElement(login_password_click).click();
        	
        }
        catch(Exception e) {
        	
        }
        
        try {
        	
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(stay_signedin_click)).click();

        	
        }
        catch(Exception e) {
        	
	}
	
}
}
