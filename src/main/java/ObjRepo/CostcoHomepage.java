package ObjRepo;

import org.openqa.selenium.By;


public class CostcoHomepage {
	
	public static By linksignin = By.id("header_sign_in");
	
	public static By AccSummery = By.xpath("//a[@id='myaccount-d']");
	public static By AccDetails = By.xpath("");
	public static By AccSignOut = By.xpath("//input[@value='Sign Out']");
	
	public static By GroceryLink = By.xpath("//a[@id='Home_Ancillary_0']");
	public static By BusinessDelivery = By.xpath("//a[@id='Home_Ancillary_1']");
	public static By optical = By.xpath("//a[@id='Home_Ancillary_2']");
	public static By pharmacy = By.xpath("//a[@id='Home_Ancillary_3']");
	public static By services = By.xpath("//a[@id='Home_Ancillary_4']");
	public static By photo = By.xpath("//a[@id='Home_Ancillary_5']");
	
	
}
