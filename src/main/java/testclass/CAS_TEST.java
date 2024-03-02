package testclass;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.testig.major.Acronyms;
import com.testig.major.Becognizant_page;
import com.testig.major.ScrollSShot;
import com.testig.major.Validation;
import io.github.bonigarcia.wdm.WebDriverManager;
//import com.testig.major.Validation;

import Utilities.DriverSetup;
public class CAS_TEST{
   public  WebDriver driver;
	
	
	@BeforeClass
	public void setup() throws IOException
	{
		driver=DriverSetup.getWebDriver();
		
		
	}
	
	@Test(priority=1)
	public void userdetails()
	{
		
		Validation v=new Validation(driver);
		v.setUsername("2303896@cognizant.com","electronic6PAV");
	}
	@Test(priority=2)
	public void user_profile() throws  IOException, InterruptedException
	{
		Becognizant_page b=new Becognizant_page(driver);
		b.profilepage();
		b.id();
		b.name();
		b.select_drpdn();
		b.select_acronym();
	}
	@Test(dependsOnMethods={"user_profile"})
	public void excel() throws IOException
	{
		Acronyms e= new  Acronyms(driver);
		e.excel();
	}
	@Test(dependsOnMethods={"excel"})
	public void screenshot() throws IOException
	{
		ScrollSShot s=new ScrollSShot(driver);
		s.screenshot();
        
	}
	@AfterClass
	public void close_broswer()
	{
		driver.quit();
	}
	
}
