package Utilities;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverSetup {

	public static WebDriver driver;
	public static WebDriver getWebDriver() throws IOException {

	Properties prop = new Properties();
	File file = new File("config.properties");
	FileInputStream fis = new FileInputStream(file);
	prop.load(fis);
     String browserName = prop.getProperty("browser");
	 WebDriver driver = null;
	 if(browserName.equalsIgnoreCase("chrome")) {
		 //driver is an object or a variable ,where we are assigning a new instance of chromedriver
		 driver = new ChromeDriver();
	 }
	 else if(browserName.equalsIgnoreCase("edge")) {
		 driver = new EdgeDriver();	 
	 }
	 else if(browserName.equalsIgnoreCase("Firefox")){
		 driver = new FirefoxDriver();
	 }
	 else {
		 System.out.println("provide a valid browser");
	 }
		
	driver.get("https://cognizantonline.sharepoint.com/sites/Be.Cognizant/SitePages/Home.aspx");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	return driver;
	}

 
}