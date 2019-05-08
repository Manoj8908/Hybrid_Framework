package ObjRepo;

import org.openqa.selenium.By;

public class CostoCretaeAccount {
	
	public static By CrtAccont = By.xpath("//a[contains(@class,'btn costco-button tertiary')]");
	public static By Entemail = By.id("register_email1");
	public static By EntPassword = By.id("logonPassword");
	public static By ReEntPassword = By.id("logonPasswordVerify");
	public static By CreateButton = By.xpath("//input[@value='Create Account']");
}
