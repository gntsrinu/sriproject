package com.automation.pom.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class RegisterPage {
	
	
	@FindBy(partialLinkText = "Register a patient")
	private WebElement lnkRegister = null;
	
	@FindBy(name = "givenName")
	private WebElement txtFirstName = null;
	
	@FindBy(name = "familyName")
	private WebElement txtLastName = null;
	
	@FindBy(id = "genderLabel")
	private WebElement lblGenderLabel = null;
	
	@FindBy(id = "gender-field")
	private WebElement lstGender = null;
	
	@FindBy(id = "birthdateLabel")
	private WebElement lblBirthDate = null;
	
	@FindBy(id = "birthdateDay-field")
	private WebElement txtDay = null;
	
	@FindBy(id = "birthdateMonth-field")
	private WebElement lstMonth = null;
	
	@FindBy(id = "birthdateYear-field")
	private WebElement txtYear = null;
	
	@FindBy(xpath = "//span[text()='Address']")
	private WebElement lblAddress = null;
	
	@FindBy(id = "address1")
	private WebElement txtAddress = null;
	
	@FindBy(id = "confirmation_label")
	private WebElement lblConfirm = null;
	
	@FindBy(id = "submit")
	private WebElement btnSubmit = null;
	
	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	
	public void regPage(String fna, String lna, String gen,String date, String month, String year, String city) throws Exception {
		
		lnkRegister.click();
		
		Thread.sleep(2000);
		
		txtFirstName.sendKeys(fna);
		
		txtLastName.sendKeys(lna);
		
		Thread.sleep(2000);
		
		lblGenderLabel.click();
		
		Thread.sleep(2000);
		
		Select select = new Select(lstGender);
		
		select.selectByVisibleText(gen);
		
		Thread.sleep(2000);
		
		lblBirthDate.click();
		
		txtDay.sendKeys(date);
		
		select = new Select(lstMonth);
		
		select.selectByVisibleText(month);
		
		txtYear.sendKeys(year);
		
		Thread.sleep(2000);
		
		lblAddress.click();
		
		txtAddress.sendKeys(city);
		
		Thread.sleep(2000);
		
		lblConfirm.click();
		
		Thread.sleep(2000);
		
		btnSubmit.click();
		
	}
	
//	@DataProvider(name = "getTestData")
//	public String[][] getData() {
//		
//		 data String[][]= {{"ABC"."DEF",""Male","1","March","2020","Guntur"}}
//		
//	}
	
	
}
