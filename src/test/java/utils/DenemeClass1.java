package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils1.AbstractDriver;

public class DenemeClass1 {

    WebDriver driver;
    WebDriverWait wait;
    public static void main(String[] args) {
        AbstractDriver ad = new AbstractDriver() {
            @Override
            public WebDriver getDriver() {
                return null;
            }
        };
    }

    public void click(WebElement e) {
        wait.until((driver) -> {
            try {
                e.click();
                return true;
            } catch (Exception e1) {
                try {
                    new Actions(driver).moveToElement(e).click().build().perform();
                    return true;
                } catch (Exception e2) {
                    try {
                        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", e);
                        return true;
                    } catch (Exception e3) {
                        return false;
                    }
                }
            }
        });
    }
}
