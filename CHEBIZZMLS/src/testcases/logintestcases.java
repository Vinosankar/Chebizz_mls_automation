package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



import commonfun.commonfun;
import pageobject.loginpage;
import pageobject.vehiclepage;
import pageobject.youraccount;


public class logintestcases extends commonfun {
	
  static Logger logger =Logger.getLogger("logintestcases");	
	

	public void login()
	{
		PageFactory.initElements(driver,loginpage.class);
		loginpage.loginpage.click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		loginpage.logid.click();
		loginpage.Emailid.sendKeys(properties.getProperty("Moblie/EmailId"));
		loginpage.password.sendKeys(properties.getProperty("Password"));
		loginpage.loginbutton.click();
		logger.info("loginpage clicked");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	
	public void details()
	{   
		PageFactory.initElements(driver,vehiclepage.class);
		
		vehiclepage.sell.click();
		logger.info("sell");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		vehiclepage.vehicle.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		vehiclepage.location.sendKeys("chennai");
		vehiclepage.varient.sendKeys("bike");
		vehiclepage.registernum.sendKeys("TN5098Ps98");
		}

	
	public void selectfun() throws InterruptedException
	{
		PageFactory.initElements(driver,vehiclepage.class);
        vehiclepage.category.click();
		Thread.sleep(5000);
		List<WebElement> dropdown=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		int position=0;
		for (WebElement webElement :dropdown)
		{
			System.out.println(webElement.getText());
			position++;
			if(position==1)
			{
				webElement.click();
				break;
			}
			Thread.sleep(3000);
			
		}
		logger.info("category option is clicked");
	}
    public void dropdown2() throws InterruptedException
    {PageFactory.initElements(driver,vehiclepage.class);
    	Thread.sleep(3000);
    	vehiclepage.brand.click();
		Thread.sleep(3000);
		List<WebElement> dropdown1=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		
		for (WebElement webElement :dropdown1)
		{
			String text =webElement.getText();
			System.out.println(text);
			if(text.contains("Aprilia"))
			{
				webElement.click();
				break;
			}
			
		}logger.info("vehicle brand selected");
    }

	public void model() throws InterruptedException
	{PageFactory.initElements(driver,vehiclepage.class);
		Thread.sleep(3000);
		vehiclepage.model.click();
		Thread.sleep(3000);
		List<WebElement> modeldrop =driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
	
		for(WebElement webElement :modeldrop)
		{
			String text =webElement.getText();
			System.out.println(text);
			if(text.contains("SR"))
			{
				webElement.click();
				break;
			}
		}
		logger.info("Vehicle model selceted");
		
	}
	
	
	public void fule()
	{
		PageFactory.initElements(driver,vehiclepage.class);
		vehiclepage.fuletype.click();
		List<WebElement> fuletype =driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for(WebElement webElement:fuletype)
		{
			String text =webElement .getText();
			System.out.println(text);
			if(text.contains("DIESEL"))
			{
				webElement.click();
				break;
			}
		}
		
		vehiclepage.distance.sendKeys("70");
		vehiclepage.price.sendKeys("300000");
		vehiclepage.next.click();
	}
	
	public void upload() throws AWTException, InterruptedException
	{
		PageFactory.initElements(driver,vehiclepage.class);
		vehiclepage.pic.click();
		StringSelection selection = new StringSelection("D:\\4_23_01_2021_12_41_02_F.jpg");
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		logger.info("image uploading sucessfully");
		vehiclepage.savebutton.click();
		vehiclepage.checkbox.click();
		logger.info("check box clicked successfully");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		vehiclepage.confirm.click();
		logger.info("confirm button clicked");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		vehiclepage.basicbox.click();
		logger.info("subscription plan selected");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		vehiclepage.button.click();
		
		
	}
	
	@Test
	public void CHEBIZZ() throws InterruptedException, AWTException
	{
		login();
		Thread.sleep(3000);
	    details();
	    selectfun();
	    dropdown2();
	    model();
	    fule();
	    upload();
	    
	   
	    
		
	}
}
	

		
	
	

	

