package base_page;

import io.github.bonigarcia.wdm.WebDriverManager;
import Utilities.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static java.lang.Thread.sleep;

public class Base_Test {
    protected WebDriver driver;

  /*  @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get(DriverFactory.getUrl());

    }*/

    @BeforeMethod
    public void setup() throws InterruptedException {

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
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}