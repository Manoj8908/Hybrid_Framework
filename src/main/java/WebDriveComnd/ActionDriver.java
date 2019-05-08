package WebDriveComnd;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.MediaEntityBuilder;

import Configuration.StartBrowser;

public class ActionDriver {
	
	static WebDriver driver;
	
	public ActionDriver() {
		
		driver = StartBrowser.driver;
		
		}
	/**
	 * Navigate To Application. Ex - https://www.google.com
	 * @throws IOException 
	 */
	public void NavigateToApplication(String URL) throws IOException {
		
		
		try {
			driver.get(URL);
			StartBrowser.childTest.pass("Navigated to URL Succefully");
		} catch (Exception e) {
			
			StartBrowser.childTest.fail("Unable to Navigated to URL ");
			MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot()).build();
			StartBrowser.childTest.info(e);
			throw e;
		}
		
		}
	/**
	 * Used to Click Action on link,button,check-box and radio-button
	 * @param Locator - Get it from OR
	 * @throws IOException 
	 */
	public void click(By Locator, String LocName) throws IOException {
		
		try {
		driver.findElement(Locator).click();
		StartBrowser.childTest.pass(" Performed Click action Succefully on :"+LocName);
	}catch (Exception e) {
		
		StartBrowser.childTest.fail(" Unable to Performed Click action on :"+LocName);
		MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot()).build();
		StartBrowser.childTest.info(e);
		throw e;
	}
	}
	/**
	 * To Perform Text in TextBox and in Test area
	 * @param Locator
	 * @param TestData
	 * @throws IOException 
	 */
	public void type(By Locator, String TestData,String LocName ) throws IOException {
		
		try {
			driver.findElement(Locator).sendKeys(TestData);
			
			StartBrowser.childTest.pass(" Performed type action Succefully on:" +LocName +"with on"+ TestData );
		} catch (Exception e) {
			StartBrowser.childTest.fail(" Unable to Performed type action on:" +LocName +"with on"+ TestData);
			MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot()).build();
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	
	public String CnfLogin(By Locator, String LocName) throws IOException {
		
		try {
			driver.findElement(Locator).getText();
			StartBrowser.childTest.pass("LogIn Vrified Succefully");
			
		} catch (Exception e) {
			StartBrowser.childTest.fail("LogIn Not-Verified");
			MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot()).build();
			StartBrowser.childTest.info(e);
			throw e;
			}
		return LocName;
		
		}
	public void MouseHover(By Locator , String LocName) throws IOException {
		
		try {
			Actions a = new Actions(driver);
			WebElement Mo = driver.findElement(Locator);
			a.moveToElement(Mo).build().perform();
			StartBrowser.childTest.pass("Performed MouseHover Succefully on :"+LocName);
		} catch (Exception e) {
			StartBrowser.childTest.fail("Not-Performed MouseHover on:"+LocName);
			MediaEntityBuilder.createScreenCaptureFromBase64String(Screenshot()).build();
			StartBrowser.childTest.info(e);
			throw e;
		}
		
	}
	
	public String Screenshot() {
		
		
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}
	
}
