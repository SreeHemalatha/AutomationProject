package stepdefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.SignupPage;

/*
This file is to implement step definitions for sign up feature using TestNG framework
 */
public class SignupFeatureSteps {

	static WebDriver driver = null;

	@BeforeMethod
	public void BeforeMethod() throws InterruptedException {
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64");
		driver.get("https://www.demoblaze.com");
		By signup = By.xpath("//*[@id=\"signin2\"]");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(signup).click();

	}

	@Test
	public void username_password() throws InterruptedException {
		SignupPage obj = new SignupPage(driver);
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		obj.enter_username("abc");
		obj.enter_password("456");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOfElementLocated(obj.button));
		obj.button.findElement(driver).click();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		obj.message();
	}

	@AfterTest
	public void aftertest() {
		driver.quit();

	}
}