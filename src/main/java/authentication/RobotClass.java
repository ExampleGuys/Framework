package authentication;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {

    /*  Robot class, java.awt'ye aittir.
        Browser, window, popup, element algilamaz.
        Sadece klavye ve mouse islemlerini, cursor'un aktif oldugu yerde isletir.
        Yapilacak islem aktif olan pencere de gecerlisir.
        Browser ya da windows penceresi olmasi farketmez.
        Action class, Selenium'a aittir ve HTML ile sinirlisir.
        Action class HTML disarisia ulasamaz.
     */


    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_SHIFT);
    }
}
