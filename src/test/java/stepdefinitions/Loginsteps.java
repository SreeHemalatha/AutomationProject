package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class Loginsteps {
	WebDriver driver = null;
	
	

	@Given("browser is open.")
	public void browser_is_open() {
		System.out.println("Inside step - browser is open ");
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testing_training\\java-selenium\\FinalProject\\target\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@And("user is on demoblaze page.")
	public void user_is_on_demoblaze_page() throws InterruptedException {
		driver.navigate().to("https://www.demoblaze.com/");
		Thread.sleep(5000);
	}

	@And("user selects login.")
	public void user_selects_login() {
		driver.findElement(By.id("login2")).click();
	}

	@When("user enters {word} and {word}")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("loginusername")).sendKeys(username);
		driver.findElement(By.id("loginpassword")).sendKeys(password);
		Thread.sleep(2000);
		
		
	}

	@And("user clicks on login.")
	public void user_clicks_on_login() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	}
	
	
	@Then("verify error message.")
	public void verify_error_message() throws InterruptedException {
	Alert alert = driver.switchTo().alert(); // switch to alert
	String alertMessage= alert.getText(); // capture alert message
	System.out.println(alertMessage); // Print Alert Message
	alert.accept();
	Thread.sleep(5000);
	driver.close();
	driver.quit();
	}

	
}
