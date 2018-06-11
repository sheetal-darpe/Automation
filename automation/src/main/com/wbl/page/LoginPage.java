package com.wbl.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import com.wbl.common.CommonPage;

public class LoginPage extends CommonPage {

	// Dependcy injection
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}

	public String login() { 
		driver.get("http://whiteboxqa.com/login.php"); 
		 driver.findElement(By.id("username")).sendKeys("test1@yahoo.com"); 
		driver.findElement(By.id("password")).sendKeys("test123");
		driver.findElement(By.cssSelector("#login")).click();
		 
		return driver.getTitle();
	}
	public boolean forgotPassword() {		
		driver.findElement(By.id("forgotpassword")).click();		
		return driver.findElement(By.id("email")).isDisplayed();
	}
	
	
	public int breadCrumbs() {
		 return driver.findElements(By.cssSelector(".breadcrumbs-list>li")).size();
	
 
	}
}
