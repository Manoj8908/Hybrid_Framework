package Reusage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Configuration.StartBrowser;
import ObjRepo.CostoCretaeAccount;
import ObjRepo.CostcoHomepage;
import ObjRepo.CostcoLoginPage;
import WebDriveComnd.ActionDriver;

public class BusinessFunction {
	
	WebDriver driver;
	ActionDriver aDriver;
	
	public BusinessFunction() {
		
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}
	public void GoTOApplication() throws IOException {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Navigate To Costco");
		aDriver.NavigateToApplication("https://www.costco.com/");
	}
	
	public void login() throws IOException {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login To Costco");
		aDriver.click(CostcoHomepage.linksignin ,"Link SignIn");
		aDriver.type(CostcoLoginPage.EmailTxt,"manoj89088@gmail.com" ,"Email text Box");
		aDriver.type(CostcoLoginPage.PasswrdTxt, "@Babamama143" , "Password Text Box");
		aDriver.click(CostcoLoginPage.ButtonSignin , "Sign In Button");
		
	}
	
	public void login(String UName,String Pwd ) throws IOException {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login To Costco");
		aDriver.click(CostcoHomepage.linksignin ,"Link SignIn");
		aDriver.type(CostcoLoginPage.EmailTxt,UName ,"Email text Box");
		aDriver.type(CostcoLoginPage.PasswrdTxt, Pwd , "Password Text Box");
		aDriver.click(CostcoLoginPage.ButtonSignin , "Sign In Button");
		
	}
	public void confirmlogin() throws IOException {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Login confirmation by Msg");
		aDriver.CnfLogin(CostcoLoginPage.Cnfmlogin, "login To Acc.");
		aDriver.click(CostcoLoginPage.ContAsNm, "Continue As Non-Member");
	}
	public void SignOutOption() throws IOException {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Sign-Out opertaion");
		aDriver.MouseHover(CostcoHomepage.AccSummery, "My Acoount link ");
		aDriver.click(CostcoHomepage.AccSignOut, "Log-Out opertaion from Costco");
	}
	public void CreateAccount(String EmailID,String Password,String RePassword) throws IOException {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Creating Acoount");
		aDriver.click(CostcoHomepage.linksignin ,"Link SignIn");
		aDriver.click(CostoCretaeAccount.CrtAccont, "Createcoount On Costo.com");
		aDriver.type(CostoCretaeAccount.Entemail, EmailID, "Entered Email");
		aDriver.type(CostoCretaeAccount.EntPassword, Password, "Entered Password");
		aDriver.type(CostoCretaeAccount.ReEntPassword, RePassword, "Entered Password Again");
		aDriver.click(CostoCretaeAccount.CreateButton, "Click Opertaion");
	}
	public void CreateAccount() throws IOException {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Test Error in Creating Acoount");
		aDriver.click(CostcoHomepage.linksignin ,"Link SignIn");
		aDriver.click(CostoCretaeAccount.CrtAccont, "Createcoount On Costo.com");
		aDriver.type(CostoCretaeAccount.Entemail, "manoj89088@gmail.com", "Entered Email");
		aDriver.type(CostoCretaeAccount.EntPassword, "@Babamama143", "Entered Password");
		aDriver.type(CostoCretaeAccount.ReEntPassword, "@Babamama143", "Entered Password Again");
		aDriver.click(CostoCretaeAccount.CreateButton, "Click Opertaion");
		
	}
}
