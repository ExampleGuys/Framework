package driver.singleton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import static driver.browser.options.BrowserOptions.*;


public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        return getDriver("chrome");
    }

    public static WebDriver getDriver(String browser){
        if (driver == null) {
            switch (browser){
                case "firefox"->{
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(firefoxOptions());
                }
                case "safary"->{
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver(safariOptions());
                }
                default -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(chromeOptions());
                }

            }
        }
        return driver;
    }


    public static void quitDriver(){
        if (driver != null)
            driver.quit();
    }




}
