package ObjRepo;

import org.openqa.selenium.By;

public class CostcoLoginPage {
	
	public static By EmailTxt = By.name("logonId");
	public static By PasswrdTxt = By.id("logonPassword");
	public static By ButtonSignin = By.xpath("//input[@value='Sign Inn']");
	public static By Cnfmlogin = By.xpath("//div[@class='row']/div/h1");
	public static By ContAsNm = By.xpath("//input[@value='Shop as Non-Member']");
	
	
}
