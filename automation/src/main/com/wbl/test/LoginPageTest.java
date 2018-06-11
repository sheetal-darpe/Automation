package com.wbl.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.common.CommonTest;
import com.wbl.page.LoginPage;
import com.wbl.pageflow.LoginPageFlow;

public class LoginPageTest extends CommonTest {
	LoginPage lp;
	
	@BeforeClass
	public void beforeClass() {
		  lp = new LoginPage(driver);
		  LoginPageFlow.goToLogin(driver);
	}

	@Test(priority=1)
	public void testLogin() {
		assertEquals("QA/QE/SDET Training.", lp.login());
	}
	
	@Test
	public void testBreadCrumbs() {
		System.out.println("breadCrumbs size::"+lp.breadCrumbs());
		assertEquals(3, lp.breadCrumbs());
	}
	@Test
	public void testForgotPassword() {
		assertEquals( true, lp.forgotPassword());
		
	}
	 

}
