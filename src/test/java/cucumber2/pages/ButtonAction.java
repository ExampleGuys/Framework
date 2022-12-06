package cucumber2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.text.MessageFormat;
import java.time.Duration;

public class ButtonAction {

    private static final String BUTTON_XPATH = "//span[@class=\"rct-text\" and .//span[contains(text(), \"{0}\")]]//button";
    private static final String CHECKBOX_XPATH = "//span[@class=\"rct-text\" and .//span[contains(text(), \"{0}\")]]//input/parent::label";

    private static final String INPUT_TEXTAREA_XPATH = "(//label[contains(text(), \"{0}\")]/ancestor::div[@id][1]//input) | (//label[contains(text(), \"{0}\")]/ancestor::div[@id][1]//textarea)[{1}]";




    private String text;
    private By locator;

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public static ButtonAction buttonAction(){
        return new ButtonAction();
    }

    private ButtonAction(){

    }

    public ButtonAction findByText(String text){
        return findByText(text, true);
    }

    public ButtonAction findByText(String text, boolean isButton){
        String xpathText;
        if (isButton)
            xpathText = MessageFormat.format(BUTTON_XPATH, text);
        else
            xpathText = MessageFormat.format(CHECKBOX_XPATH, text);

        this.locator = By.xpath(xpathText);
        return this;
    }


    public void click(){
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        }catch (Exception e){
            try {
                clickByAction();
            }catch (Exception ee){
                clickByJS();
            }
        }

    }

    private void clickByAction(){
        new Actions(driver).moveToElement(element(locator)).click().build().perform();
    }

    private void clickByJS(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element(locator));
    }

    public void hover(){
        new Actions(Driver.getDriver())
                .moveToElement(element(locator))
                .build()
                .perform();
    }


    private WebElement element(By locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /*
    Text alsin
    xpath'i bulun
    click etsin
     */






}
