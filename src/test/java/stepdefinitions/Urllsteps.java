package stepdefinitions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Urllsteps {
	WebDriver driver=null;
	@Given("user is on the chrome browser")
	public void browser_is_open() {
	 System.out.println("Inside step - browser is open ");
	 System.setProperty("webdriver.chrome.driver","D:\\Testing_training\\java-selenium\\FinalProject\\target\\drivers\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
}
	@When("user enter URL")
	public void user_enters_url() throws
	InterruptedException {
		driver.get("https://www.demoblaze.com/");
	 	Thread.sleep(2000);
}
	
	@Then("It should load Demoblaze homepage")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		driver.findElement(By.id("nava")).isDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	System.out.println("Inside Step - user is navigated to demoblaze home"); 

	}

}