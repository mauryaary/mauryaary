package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page_locators {
    WebDriver driver;

    // Constructor
    public Login_page_locators(WebDriver driver) {
        this.driver = driver;
    }
    By UserClick = By.xpath("//label[@class='QQ7PNk']");
    By username = By.xpath("//input[contains(@class,'xkp9Hl ZvCKfk')]");
    By crossbutton = By.xpath("//span[@class='b3wTlE']");
    By serchbutton =By.xpath("//input[@title='Search for Products, Brands and More']");
    By password = By.id("password");
    By loginBtn = By.id("login");

    public void LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void username(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }
    public void click() {
        driver.findElement(UserClick).click();
    }
    public void crossbutton() {
        driver.findElement(crossbutton).click();
    }
    public void search(String text) {
        driver.findElement(serchbutton).sendKeys(text);

    }
    public void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

}