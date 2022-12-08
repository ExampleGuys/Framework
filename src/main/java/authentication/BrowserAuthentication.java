package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import testng.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class BrowserAuthentication extends BaseTest {

    By basicAuthText = By.xpath("//h3[contains(., 'Basic Auth')]");

    @Test
    public void authenticationWithRobotClass() throws AWTException {
        String url = "https://the-internet.herokuapp.com/basic_auth";

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
    public void authenticationWithURL(){
        String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
        driver.get(url);
        wait.until(ExpectedConditions.visibilityOfElementLocated(basicAuthText));
    }

    @Test
    public void authenticationWithAutoIt() throws IOException {
        String url = "https://the-internet.herokuapp.com/basic_auth";
        driver.get(url);
        Runtime.getRuntime().exec("src/main/resources/login.exe");
        wait.until(ExpectedConditions.visibilityOfElementLocated(basicAuthText));

    }

}
