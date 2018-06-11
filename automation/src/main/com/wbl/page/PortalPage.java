package com.wbl.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wbl.common.CommonPage;

public class PortalPage extends CommonPage {

	public PortalPage(WebDriver driver) {
		super(driver);
	}

	public int socialIcon() {

		List<WebElement> elements = driver.findElements(By.cssSelector(".container .social-icons li"));
		return elements.size();
	}

	public boolean isLogoPresent() {
		return driver.findElement(By.id("logo")).isDisplayed();
	}

	public int navItems() {
		return driver.findElements(By.cssSelector(".nav-item")).size();

	}

	public boolean isFooterPresent() {
		return driver.findElement(By.id("footerbot")).isDisplayed();
	}
}
