package commonfun;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commonfun  {
	public static Properties properties = null;
	public static WebDriver driver=null;
	Logger logger = Logger.getLogger(commonfun.class);
	
	public Properties LoadPropertiesfile() throws IOException
	{
		FileInputStream fileInputStream =new FileInputStream("config.properties");
		 properties =new Properties();
	        properties.load(fileInputStream);
	        return properties;
	}
	
	@BeforeSuite
	public void lanchbrowser() throws IOException
	{
		PropertyConfigurator.configure("log4j.properties");
		LoadPropertiesfile();
		logger.info("loading propertiesfiles");
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driverlocation=properties.getProperty("Driverlocation");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverlocation);
			 driver = new ChromeDriver();
		
		}
		else
			if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.drivre", driverlocation);
		    driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		logger.info("get URl");
	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	@AfterSuite
	public void tearDown()
	{
		
	}
	
	

	
	
	

}
