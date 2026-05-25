package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    // Locating the elements necessary for login purpose using locators
    private By checkOutButton = By.id("checkout");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    //Constructor that ensures synchronization of test script and the browser

    public void clickOnCheckoutButton(){driver.findElement(checkOutButton).click();}
}
