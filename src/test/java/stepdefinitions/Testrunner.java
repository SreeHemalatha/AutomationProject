package stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features", glue =
        {"src\\test\\java\\stepdefinitions"},
        monochrome = true,
        plugin = {"pretty", "junit:target/JUnitReports/report.xml",
                "json:target/JSONreport/report.json",
                "html:target/HtmlReports"},
        tags = "@snitytest")
public class Testrunner {

}
