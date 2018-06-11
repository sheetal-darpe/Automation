package com.wbl.pageflow;

import org.openqa.selenium.WebDriver;

import com.wbl.page.HomePage;

public class LoginPageFlow   {
	 

	public static void goToLogin(WebDriver driver){
		
		HomePage  hp= new HomePage (driver);
		hp.clickLogin();
	}

}
