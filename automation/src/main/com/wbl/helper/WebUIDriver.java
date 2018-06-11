package com.wbl.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebUIDriver {

	private static String LOCATION = System.getProperty("user.dir") + "/resources/drivers/";
	 

	public static WebDriver getDriver(String browser) {

		WebDriver driver = null;

		switch (browser) {
		case "fireFox":
			System.setProperty("webDriver.gecko.driver", LOCATION + "geckodriver");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", LOCATION + "chromedriver");
			driver = new ChromeDriver();
			break;
		case "ie":
			System.setProperty("webderiver.internetExplorer.driver", LOCATION + "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		case "opera":
			System.setProperty("webderiver.opera.driver", LOCATION + "operadriver.exe");
			driver = new OperaDriver();
			break;
		case "sefari":
			System.setProperty("webderiver.safary.driver", LOCATION + "safarydriver.exe");
			driver = new SafariDriver();
			break;
		case "htmlUnit":
			driver = new HtmlUnitDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver", LOCATION + "chromedriver.exe");
			driver = new ChromeDriver();
		}

		return driver;
	}

}
