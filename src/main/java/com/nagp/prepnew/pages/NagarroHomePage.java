package com.nagp.prepnew.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nagp.prepnew.base.TestBase;

public class NagarroHomePage extends TestBase{
	
	public NagarroHomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='mainHeader--logo']/a/img[@class='mainHeader--logoLight nav-logo']")
	WebElement homePageLogo;
	
	@FindBy(linkText="contact us")
	WebElement contactUsLink;
	
	public boolean validateNagarroHomePageLogo(){
		return homePageLogo.isDisplayed();
		
	}
	
	public NagarroContactUsPage validateContactUsPageClick(){
		contactUsLink.click();
		return new NagarroContactUsPage();
	}

}
