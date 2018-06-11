package com.wbl.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wbl.common.CommonPage;
import com.wbl.helper.ConfigUtil;
import com.wbl.helper.WebUIDriver;

public class HomePage extends CommonPage {
	 WebElement element;
	 
	 

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public int CountSlides() {
		return driver.findElements(By.cssSelector(".slides li")).size();
	}

	public int sectionHeaders() {
		return driver.findElements(By.cssSelector(".section-heading .line")).size();
	}

	public boolean videoElement() {
		return driver.findElement(By.cssSelector("#vid_1")).isDisplayed();
	}

	public void clickLogin() {

		driver.findElement(By.linkText("Login")).click();
	 
	}
}
