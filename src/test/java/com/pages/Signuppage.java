package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;

public class Signuppage {
	WebDriver driver;

	public Signuppage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);

	}

	@FindBy(how=How.ID,using="sign-username")
	 WebElement sign_username;
	
	@FindBy(xpath = "//*[@id=\"sign-password\"]")
	WebElement txt_password;
	
	@FindBy(css = "#signInModal > div > div > div.modal-footer > button.btn.btn-primary ")
	WebElement button;

	public void enter_username(String username) {
		sign_username.sendKeys(username);
	}

	public void enter_password(String password) {
		 txt_password.sendKeys(password);
	}

	public void button() {
		button.click();
	}
	public void message() {
		Alert confirmation = driver.switchTo().alert();
		String alerttext = confirmation.getText();
		
		
	
	}
	}
