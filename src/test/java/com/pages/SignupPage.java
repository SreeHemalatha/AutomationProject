package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

/*
 * This file contains web elements on the sign-up page
 */
public class SignupPage {
	
	//WebDriver instance
	WebDriver driver;

	//constructor to initiate webdriver and page factory
	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);

	}
	
	@FindBy(how=How.ID,using="sign-username")
	 WebElement sign_username;
	
	@FindBy(xpath = "//*[@id=\"sign-password\"]")
	WebElement txt_password;
	
	public By button = By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary ");

	public void enter_username(String username) {
		sign_username.sendKeys(username);
	}

	public void enter_password(String password) {
		 txt_password.sendKeys(password);
	}

	public void message() {
		Alert confirmation = driver.switchTo().alert();
		String alerttext = confirmation.getText();
		
		
	
	}
	}
