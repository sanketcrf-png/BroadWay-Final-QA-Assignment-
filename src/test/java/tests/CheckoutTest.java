package tests;

import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class CheckoutTest extends BaseClass {

    public void prepareCartAndNavigateToCheckout() {  // Wrap the actions inside a method so Java recognizes them
        LoginPage lpg = new LoginPage(driver); //initializing login page
        InventoryPage inventoryPage = lpg.loginAs("standard_user", "secret_sauce");
        inventoryPage.addToCart("Sauce Labs Backpack");
        inventoryPage.addToCart("Sauce Labs Bike Light");
        inventoryPage.goToCart();
    }

    public void navigatingToCheckout(){
        CartPage cpg = new CartPage(driver);
        cpg.clickOnCheckoutButton();
    }

    public void testCheckout(){
        CheckOutPage cop = new CheckOutPage(driver);
        cop.enterFirstName("Tester");
        cop.enterLastName("Tester");
        cop.enterPostalCode("9211");
        cop.continueCheckout();
        cop.clickFinish();

        String expectedMSG = "Thank you for your order!";
        String actualMsg = cop.getConfirmation();
        Assert.assertEquals(actualMsg,expectedMSG);
    }
}
