package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    // Locating the elements necessary for login purpose using locators
    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMsg = By.cssSelector("h3[data-test='error']");

    // constructor in Java used to initialize your Selenium Page Object Model (POM) classes.
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Actions to be done on the locators above to complete login
    public InventoryPage loginAs(String userName, String password){
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
//Used this format to make it reusable in every page requiring login function
        return new InventoryPage(driver);
    }

    //String is used instead of void as void returns nothing after execution
    public String getErrorMessage() { return driver.findElement(errorMsg).getText();}
}
