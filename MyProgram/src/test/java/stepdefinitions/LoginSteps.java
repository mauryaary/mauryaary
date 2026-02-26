package stepdefinitions;

import Utilities.ConfigReader;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

public class LoginSteps {

    WebDriver driver;

    public LoginSteps() {
        // zero argument constructor (optional but safe)
    }

    @Given("User launches browser")  @BeforeMethod
    public void user_launches_browser() throws InterruptedException {

            ConfigReader config = new ConfigReader();

            String browser = config.getBrowser();

            if (browser.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            }
            else if (browser.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }

            driver.manage().window().maximize();
            driver.get(config.getUrl());
            Thread.sleep(3000);
    }
}