package cucumber.authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import testng.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class BrowserAuthentication extends BaseTest {

    String url = "https://the-internet.herokuapp.com/basic_auth";
    String urlBasic = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
    String username = "admin";
    String password = "admin";


    By basicAuthText = By.xpath("//h3[contains(., 'Basic Auth')]");

    @Test
    public void authentication1() throws AWTException {
        driver.get(url);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_A);robot.delay(50);
        robot.keyPress(KeyEvent.VK_D);robot.delay(50);
        robot.keyPress(KeyEvent.VK_M);robot.delay(50);
        robot.keyPress(KeyEvent.VK_I);robot.delay(50);
        robot.keyPress(KeyEvent.VK_N);robot.delay(50);
        robot.keyPress(KeyEvent.VK_TAB);robot.delay(50);
        robot.keyPress(KeyEvent.VK_A);robot.delay(50);
        robot.keyPress(KeyEvent.VK_D);robot.delay(50);
        robot.keyPress(KeyEvent.VK_M);robot.delay(50);
        robot.keyPress(KeyEvent.VK_I);robot.delay(50);
        robot.keyPress(KeyEvent.VK_N);robot.delay(50);
        robot.keyPress(KeyEvent.VK_TAB);robot.delay(50);
        robot.keyPress(KeyEvent.VK_ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(basicAuthText));
    }


    @Test
    public void authentication2(){

        driver.get(urlBasic);
        wait.until(ExpectedConditions.visibilityOfElementLocated(basicAuthText));
    }

    @Test
    public void authentication3() throws IOException {
        driver.get(url);
        Runtime.getRuntime().exec("src/main/resources/login.exe");
        wait.until(ExpectedConditions.visibilityOfElementLocated(basicAuthText));

    }

}
