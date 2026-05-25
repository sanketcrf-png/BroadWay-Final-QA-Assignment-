package Pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class InventoryPage extends BaseClass {
    private WebDriver driver;

    //Locating all the elements required in the assignment
    private By filterDropdown = By.xpath("//select[@class='product_sort_container']");
    private By itemNames = By.className("inventory_item_name");
    private By itemPrices = By.className("inventory_item_price");
    private By cartBadge = By.className("shopping_cart_badge");
    private By cartButton = By.className("shopping_cart_link");

    //Constructor that ensures synchronization of test script and the browser
    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }

    //Actions to be done on the locators above
    public void selectFilter(String value) {
        new Select(driver.findElement(filterDropdown)).selectByValue(value);
    }

    public List<String> getAllProductNames() {
        return driver.findElements(itemNames).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public List<Double> getAllProductPrices() {
        return driver.findElements(itemPrices).stream()
                .map(e -> Double.parseDouble(e.getText().replace("$", "")))
                .collect(Collectors.toList());
    }

    public void addToCart(String itemName) {
        String xpath = "//div[text()='" + itemName + "']/ancestor::div[@class='inventory_item']//button";
        driver.findElement(By.xpath(xpath)).click();
    }

    public String getCartCount() {return driver.findElement(cartBadge).getText();}
    public void goToCart() {driver.findElement(cartButton).click();}
}
