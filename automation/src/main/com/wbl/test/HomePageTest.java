package com.wbl.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.common.CommonPage;
import com.wbl.common.CommonTest;
import com.wbl.page.HomePage;

public class HomePageTest extends CommonTest{
	HomePage hp;
	CommonPage cp;
	
	public HomePageTest () {
		super();
		cp= new CommonPage(driver);
		hp= new HomePage(driver);
		
	}
	/*@BeforeClass
	public void beforeClass(){
		hp= new HomePage(driver);
	}*/
	@Test
	public void testSlides(){
		assertEquals(6, hp.CountSlides());
		
	}
	@Test
	public void testSectionHeaders(){
		assertEquals(4, hp.sectionHeaders());
		
	}
	@Test
	public void testVideoElement(){
		assertEquals(true, hp.videoElement());
		
	}

}
