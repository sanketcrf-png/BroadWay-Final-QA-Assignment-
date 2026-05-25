package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {
    protected WebDriver driver;

    //This class manages the initial page setup
    @BeforeMethod //This method runs before actual test method
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }

    //This class exits the page after the task is done
    @AfterMethod //This method runs after the actual test method completes
    public void tearDown(){
        driver.quit();
    }
}
