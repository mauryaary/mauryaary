package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class LoginTest extends AbstractTestNGCucumberTests {
}