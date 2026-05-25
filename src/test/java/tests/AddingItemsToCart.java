package tests;

import Pages.InventoryPage;
import Pages.LoginPage;
import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingItemsToCart extends BaseClass{
    LoginPage lpg = new LoginPage(driver);
    InventoryPage inventoryPage = lpg.loginAs("standard_user","secret_sauce");

    @Test
    public void testAddTOCartAndCartCount() {
        InventoryPage IPG = new InventoryPage(driver);
        IPG.addToCart("Sauce Labs Backpack");
        IPG.addToCart("Sauce Labs Bike Light");

        Assert.assertEquals(IPG.getCartCount(), "2");
    }
}
