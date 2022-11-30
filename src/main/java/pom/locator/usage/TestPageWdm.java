package pom.locator.usage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import utils.Driver;

import java.text.MessageFormat;
import java.util.ArrayList;

public class TestPageWdm {

    WebDriver driver;
    String url = "https://opencart.abstracta.us/";
    By lSearchInput = By.xpath("//input[@name='search']");
    By lSearchButton = By.cssSelector("#search button");


    @Test(dataProvider = "data")
    public void test1(Class<? extends WebDriver> browserClass) throws InterruptedException {

        driver = WebDriverManager.getInstance(browserClass).create();

        driver.get(url);
        driver.findElement(lSearchInput).sendKeys("mac");
        driver.findElement(lSearchButton).click();
        Thread.sleep(5000);
        driver.quit();


    }

    @DataProvider
    public Object[][] data(){
        return new Object[][]{
                {ChromeDriver.class},
                {FirefoxDriver.class}
        };
    }


}
