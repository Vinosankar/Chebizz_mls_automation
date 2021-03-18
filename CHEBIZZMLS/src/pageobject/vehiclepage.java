package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class vehiclepage {
	@FindBy(id="Rform:j_idt36")
	public static WebElement sell;

	@FindBy(id="Rform:j_idt59")
	public static WebElement vehicle;
	
	@FindBy(id="Rform:loc_input")
	public static WebElement location;
	@FindBy(id="Rform:categoryFK")
	public static WebElement category;
	@FindBy(id="Rform:brandFk")
	public static WebElement brand;
	
	@FindBy(id="Rform:modelFK")
	public static WebElement model;
	@FindBy(id="Rform:trim")
	public static WebElement varient;
	@FindBy(id="Rform:regNo")
	public static WebElement registernum;
	@FindBy(id="Rform:fueltypeFK")
	public static WebElement fuletype;
	@FindBy(id="Rform:distance")
	public static WebElement distance;
	@FindBy(id="Rform:sellPrice")
	public static WebElement price;
	@FindBy(name="Rform:j_idt112")
	public static WebElement next;
	@FindBy(id="Rform:fileuploadde2")
	public static WebElement pic;
	@FindBy(xpath="//*[@id='Rform:SavePhoto'][@name='Rform:SavePhoto']")
	public static WebElement savebutton;
	@FindBy(id="Rform:condition")
	public static WebElement checkbox;
	@FindBy(xpath="//*[@id=\'Rform:j_idt482\']/span[2]")
	public static WebElement confirm;
	@FindBy(id="Rform:silver")
	public static WebElement basicbox;
	@FindBy(xpath="//*[@id=\"Rform:j_idt320\"]/span")
	public static WebElement button;

	
	
	
	
	/*@FindBy(id="Rform:regNo")
	public static WebElement year; 
	@FindBy(id="Rform:fueltypeFK_label")
	public static WebElement fuletype; 
	@FindBy(id="Rform:numberofowners_label")
	public static WebElement numberofowner;
	@FindBy(id="Rform:distance")
	public static WebElement distance;
	@FindBy(id="Rform:sellPrice")
	public static WebElement price; */
	
	
	
	

}
