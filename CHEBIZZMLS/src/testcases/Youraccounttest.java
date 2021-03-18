package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfun.commonfun;
import pageobject.loginpage;
import pageobject.vehiclepage;
import pageobject.youraccount;

public class Youraccounttest extends commonfun {
	public void login()
{
	PageFactory.initElements(driver,loginpage.class);
	loginpage.loginpage.click();
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	loginpage.logid.click();
	loginpage.Emailid.sendKeys(properties.getProperty("Moblie/EmailId"));
	loginpage.password.sendKeys(properties.getProperty("Password"));
	loginpage.loginbutton.click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	public void account()
	{
		PageFactory.initElements(driver,youraccount.class);
		youraccount.profile.click();
	}
	
	
   @Test
   
	public void Account() throws InterruptedException
	{
	   login();
	   account();
	   


	}

}
