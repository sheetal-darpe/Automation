package com.wbl.common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.wbl.helper.ConfigUtil;
import com.wbl.helper.WebUIDriver;

public class CommonTest {

	public WebDriver driver;

	@BeforeClass
	public  void beforeClass() {
		ConfigUtil config= new ConfigUtil("Config");
		System.out.println( " BROWSER::"+config.BROWSER);
		driver =  WebUIDriver.getDriver(config.BROWSER);
		driver.get(config.URL);
		driver.manage().window().maximize();

	}
	 
	
	@AfterClass
		public void afterSuite(){
		driver.close();
	}

}
