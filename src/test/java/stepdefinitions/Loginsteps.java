package stepdefinitions;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Loginsteps {
    WebDriver driver = null;

    @Given("browser is open.")
    public void browser_is_open() {
        System.out.println("Inside step - browser is open ");
        System.setProperty("webdriver.chrome.driver", "D:\\Testing_training\\java-selenium\\cucumber2\\target\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    }

    @And("user is on demoblaze page.")
    public void user_is_on_demoblaze_page() {
        driver.navigate().to("https://www.demoblaze.com/");
    }

    @And("click on login button.")
    public void clicks_on_login_button() {
        driver.findElement(By.id("login2")).click();
    }

    @When("user enters {word} and {word}")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        driver.findElement(By.id("loginusername")).sendKeys(username);
        driver.findElement(By.id("loginpassword")).sendKeys(password);
        Thread.sleep(2000);
    }

    @And("user clicks on login.")
    public void user_clicks_on_login() {
        //btn btn-primary
        driver.findElement(By.cssSelector("btn.btn-primary")).click();
        driver.close();
        driver.quit();
    }

    @Then("error message displays.")
    public void error_message_displays() {
        System.out.println("Inside Step - user is navigated to demoblaze home");
    }

}
