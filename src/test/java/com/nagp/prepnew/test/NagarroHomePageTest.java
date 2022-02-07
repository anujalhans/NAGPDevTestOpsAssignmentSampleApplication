package com.nagp.prepnew.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.nagp.prepnew.util.TestUtil;
import com.nagp.prepnew.base.TestBase;
import com.nagp.prepnew.customlistener.ExtentListener;
import com.nagp.prepnew.pages.NagarroContactUsPage;
import com.nagp.prepnew.pages.NagarroHomePage;

public class NagarroHomePageTest extends TestBase{
	NagarroHomePage nagarroHomePage;
	NagarroContactUsPage nagarroContactUsPage;
	TestUtil testUtil;
	
	public NagarroHomePageTest() {
		super();
	}
	
	
	@BeforeSuite
	public void setExtent(){
		testUtil = new TestUtil();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		nagarroHomePage = new NagarroHomePage();
		nagarroContactUsPage = new NagarroContactUsPage();
	}
	
	@Test
	public void validateNagarroHomePageLogoTest(){
		ExtentListener.test.log(Status.INFO, "Test Started for validateNagarroHomePageLogoTest");
		boolean nagarroHomePageLogoResult = nagarroHomePage.validateNagarroHomePageLogo();
		Assert.assertEquals(nagarroHomePageLogoResult, true);
		ExtentListener.test.log(Status.INFO, "Test Completed for validateNagarroHomePageLogoTest");
	}
	
	@Test
	public void validateNagarroContactUsPageClickTest(){
		ExtentListener.test.log(Status.INFO, "Test Started for validateNagarroContactUsPageClickTest");
		NagarroContactUsPage nagarroPage = nagarroHomePage.validateContactUsPageClick();
		Assert.assertEquals(driver.getTitle(), "Contact us | Nagarro");
		ExtentListener.test.log(Status.INFO, "Test Completed for validateNagarroContactUsPageClickTest");
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
