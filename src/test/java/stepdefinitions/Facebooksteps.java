package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
public class Facebooksteps {
	WebDriver driver = null;
    @Given("Browser is open.")
 public void Browser_is_open(){
    	System.setProperty("webdriver.chrome.driver","D:\\Testing_training\\java-selenium\\FinalProject\\target\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
}
   @When("user enters facebook url.") 
   public void user_enters_url() {
	   driver.get("https://www.facebook.com/");
	   
	  
   }
@Then("verify user is on facebook home page.")
 public void verify_the_link() throws InterruptedException  {
	Thread.sleep(5000);
	 String expectedTitle = "Facebook - log in or sign up";
     String actualTitle = driver.getTitle();
     assertEquals(actualTitle, expectedTitle);
    driver.close();
}





}