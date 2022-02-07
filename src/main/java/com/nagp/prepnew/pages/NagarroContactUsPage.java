package com.nagp.prepnew.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nagp.prepnew.base.TestBase;

public class NagarroContactUsPage extends TestBase{
	
	public NagarroContactUsPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='page-btn page-btn01']")
	WebElement contactUsBtn;
	
	@FindBy(xpath="//a[@id='hs-eu-confirmation-button']")
	WebElement acceptCookiesBtn;
	
	public NagarroGingerBotPage validateContactUsButtonClick() throws InterruptedException{
		acceptCookiesBtn.click();
		Thread.sleep(3000);
		contactUsBtn.click();
		return new NagarroGingerBotPage();
	}

}
