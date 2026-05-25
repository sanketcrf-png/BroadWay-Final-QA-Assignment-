package tests;

import Pages.InventoryPage;
import Pages.LoginPage;
import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilterProductsInInventoryTest extends BaseClass {

    @Test(priority = 1)
    public void testDescendingNameFilter() {
        LoginPage lpg = new LoginPage(driver);
        InventoryPage inventoryPage = lpg.loginAs("standard_user", "secret_sauce");

        //Apply filter (Z to A)
        inventoryPage.selectFilter("za");

        //Getting the list from UI
        List<String> actualNames = inventoryPage.getAllProductNames();

        //Created an expected list by sorting the actual list manually
        List<String> expectedNames = new ArrayList<>(actualNames);
        Collections.sort(expectedNames, Collections.reverseOrder());

        //Asserting
        Assert.assertEquals(actualNames, expectedNames, "Products are not sorted in descending order (Z-A)!");
    }

    @Test(priority = 2)
    public void testPriceLowHigh() {
        LoginPage lpg = new LoginPage(driver);
        InventoryPage inventoryPage = lpg.loginAs("standard_user", "secret_sauce");

        //Apply filter (Price Low to High)
        inventoryPage.selectFilter("lohi");

        //Get the actual prices from the UI
        List<Double> actualPrices = inventoryPage.getAllProductPrices();

        //Created an expected list and sort it numerically
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        Collections.sort(expectedPrices);

        //Asserting
        Assert.assertEquals(actualPrices, expectedPrices, "Prices are not sorted from Low to High!");
    }
}

