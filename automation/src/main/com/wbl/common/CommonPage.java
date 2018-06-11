package com.wbl.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wbl.page.HomePage;
import com.wbl.page.LoginPage;
import com.wbl.page.PortalPage;


public class CommonPage {
	protected WebDriver  driver;
	WebElement element;
	
	//WebUIDriver webdriver= new WebUIDriver();
	// WebDriver  driver= WebUIDriver.getDriver(  new ConfigUtil("Config.properties"));

	public CommonPage(WebDriver driver) {
	
		this.driver = driver;
	}
	
	
	public HomePage logoClick() {
		
		element= driver.findElement(By.id("id"));
		return new HomePage(driver);
	}
	
public LoginPage loginClick() {
		
		element= driver.findElement(By.id("id"));
		return new LoginPage(driver);
	}
public PortalPage portalClick() {
	
	element= driver.findElement(By.id("id"));
	return new PortalPage(driver);
}

}
