package screenshot;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.BaseTest;
import utils.BrowserConfig;
import utils.Utils;

import static testng.LocatorsInterface.*;

public class ScreenShotTest extends BaseTest {

    // bu degiskenler browser yapilandirmasi icin kullanilacagi icin
    // browser create edilmeden initialize edilmelidir.
    {
        BrowserConfig.headless = true;
        BrowserConfig.takeScreenShot = true;
    }

    @Test
    public void test_Screenshot1(){

        driver.get(url);
        sendKeys(searchInput, "mac");
        click(searchButton);
        String title = driver.getTitle();
        Utils.myAssertA(title, "mac");
        /*
        try {
            Assert.assertEquals(title, "mac");
        }catch (AssertionError e){
            Utils.takeScreenShot();
            //Assert.fail();
        }

         */
    }


}
