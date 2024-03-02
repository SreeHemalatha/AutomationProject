package stepdefinitions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\login.feature",glue=
{"src\\test\\java\\stepdefinitions\\Loginsteps.java"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml",
"json:target/JSONreport/report.json",
"html:target/HtmlReports"},
tags="@snitytest")
public class Testrunner {

}
