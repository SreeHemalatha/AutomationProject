package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.Contactpage;
import com.utility.Excelreader;
import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contactsteps {
	private Contactpage contactPage;
	WebDriver driver;

	@Given("user navigates to contact page")
	public void contactpage() throws InterruptedException {
		driver = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver",
				"D:\\Testing_training\\java-selenium\\FinalProject\\target\\drivers\\chromedriver.exe");
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a"));
		element.click();
		contactPage = new Contactpage(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("user fills the contact form from given sheetname {string} and rownumber {int}")
	public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber)
			throws InvalidFormatException, IOException {

		Excelreader reader = new Excelreader();
		List<Map<String, String>> testData = reader
				.getData("D:\\Testing_training\\java-selenium\\FinalProject\\src\\test\\resources\\contactus.xlsx", "sheet1");
		String contactEmail = testData.get(rowNumber).get("contactemail");
		String contactName = testData.get(rowNumber).get("contactname");
		String message = testData.get(rowNumber).get("message");
		contactPage.fillContactForm(contactEmail, contactName, message);

	}

	@And("user clicks on send button")
	public void user_clicks_on_send_button() {
		contactPage.clickSend();
	}

	@Then("validate the outcome")
	public void it_shows_a_successful_message() {
		Alert messagePopup = contactPage.message();
		String actualSuccessMessage = messagePopup.getText();
		String expSuccessMessage = ("Thanks for the message!!");
		Assert.assertEquals(actualSuccessMessage, expSuccessMessage);
		messagePopup.accept();
		driver.close();
	}
}
