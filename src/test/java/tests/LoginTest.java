package tests;

import Pages.InventoryPage;
import Pages.LoginPage;
import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//importing base class as parent class
public class LoginTest extends BaseClass {

    @Test(priority = 1)//these are annotations in Testng where @Test tells compiler that the part of the code is a test
    public void testValidLogin(){
        LoginPage lpg = new LoginPage(driver);
        InventoryPage inventoryPage = lpg.loginAs("standard_user", "secret_sauce");

        String titleOfPage = driver.getTitle();//Getting title form the UI
        Assert.assertEquals(titleOfPage, "Swag Labs");//assertEquals compares the expected and actual element
    }

    @Test(priority = 2)//priority is an annotation of TestNG which controls execution order of test
    public void testInvalidLogin(){
        LoginPage lpg = new LoginPage(driver);
        InventoryPage inventoryPage = lpg.loginAs("nepali_user", "nepali_sauce");

        String expectedMsg = "Epic sadface: Username and password do not match any user in this service";
        String actualMsg = lpg.getErrorMessage();

        Assert.assertEquals(actualMsg, expectedMsg);
    }
}
