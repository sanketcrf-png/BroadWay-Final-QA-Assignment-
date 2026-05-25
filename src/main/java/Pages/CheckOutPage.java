package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;
    // Locating the elements necessary for login purpose using locators
    private By firstNamePlaceholder = By.id("first-name");
    private By lastNamePlaceholder = By.id("last-name");
    private By postalCodePlaceholder = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");
    private By successHeader = By.className("complete-header");

    public CheckOutPage(WebDriver driver){
        this.driver = driver;
    }//Constructor that ensures synchronization of test script and the browser

    public void enterFirstName(String FirstName){driver.findElement(firstNamePlaceholder).sendKeys(FirstName);}
    public void enterLastName(String LastName){driver.findElement(lastNamePlaceholder).sendKeys(LastName);}
    public void enterPostalCode(String PostalCode){driver.findElement(postalCodePlaceholder).sendKeys(PostalCode);}
    public void continueCheckout() {driver.findElement(continueButton).click();}
    public void clickFinish() {driver.findElement(finishButton).click();}

    public String getConfirmation() {return driver.findElement(successHeader).getText();}
}
