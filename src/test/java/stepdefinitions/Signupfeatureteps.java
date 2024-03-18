package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pages.Signuppage;
import java.util.concurrent.TimeUnit;

public class Signupfeatureteps {

	static WebDriver driver = null;
	
   	@BeforeMethod
	public void BeforeMethod()throws InterruptedException {
		driver = new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64");
		driver.get("https://www.demoblaze.com");
		By signup = By.xpath("//*[@id=\"signin2\"]");
		driver.findElement(signup).click();
		Thread.sleep(4000);
				
	}

	@Test
	public void username_password() throws InterruptedException {
		Signuppage obj = new Signuppage(driver);
		Thread.sleep(9000);
		obj.enter_username("cbz");
		obj.enter_password("456");
		obj.button();
		Thread.sleep(3000);
		obj.message();
		Thread.sleep(2000);
	}
	@AfterTest
	public void aftertest(){
		driver.quit();
		
	}
}