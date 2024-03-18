package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contactpage {
	private WebDriver driver;
	private By contactEmail = By.id("recipient-email");
	private By contactName = By.id("recipient-name");
	private By messageText = By.id("message-text");
	private By sendButton = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");

	public Contactpage(WebDriver driver) {
		this.driver = driver;

	}

	public String getContactPageTitle() {
		return driver.getTitle();
	}

	public void fillContactForm(String email, String name, String message) {
		driver.findElement(contactEmail).sendKeys(email);
		driver.findElement(contactName).sendKeys(name);
		driver.findElement(messageText).sendKeys(message);
	}

	public void clickSend() {
		driver.findElement(sendButton).click();
	}

	public Alert message() {
		Alert confirmation = driver.switchTo().alert();
		
		return confirmation;

	}
}
