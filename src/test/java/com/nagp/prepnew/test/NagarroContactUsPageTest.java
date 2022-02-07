package com.nagp.prepnew.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.nagp.prepnew.base.TestBase;
import com.nagp.prepnew.customlistener.ExtentListener;
import com.nagp.prepnew.pages.NagarroContactUsPage;
import com.nagp.prepnew.pages.NagarroGingerBotPage;
import com.nagp.prepnew.pages.NagarroHomePage;
import com.nagp.prepnew.util.TestUtil;

public class NagarroContactUsPageTest extends TestBase{
	
	NagarroContactUsPage nagarroContactUsPage;
	TestUtil testUtil;
	NagarroHomePage nagarroHomePage;
	
	public NagarroContactUsPageTest() {
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
		nagarroHomePage.validateContactUsPageClick();
		
	}
	
	@Test
	public void validateContactUsButtonClickTest() throws InterruptedException{
		ExtentListener.test.log(Status.INFO, "Test Started for validateContactUsButtonClickTest");
		NagarroGingerBotPage nagarroGingerBotPage = nagarroContactUsPage.validateContactUsButtonClick();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.nagarro.com/en/contact-us");
		ExtentListener.test.log(Status.INFO, "Test Completed for validateContactUsButtonClickTest");
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	

}
