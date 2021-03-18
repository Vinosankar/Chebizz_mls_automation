package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	@FindBy(id="Rform:j_idt14")
	public static WebElement loginpage;
	@FindBy(xpath="//*[@id='Rform']/div/div[4]/div[3]/div/div/div[2]/div[1]/button[2]")
	public static WebElement logid;
	@FindBy(id="Rform:email")
	public static WebElement Emailid;
	@FindBy(id="Rform:password")
	public static WebElement password;
	@FindBy(id="Rform:btnSearch")
	public static WebElement loginbutton;
	

	
	
	

}
