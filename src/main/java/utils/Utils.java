package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {


    public static void myAssert(String a, String b){
        myAssert(a, b, true);
    }
    public static void myAssert(String a, String b, boolean screenshot){
        try {
            Assert.assertEquals(a, b);
        }catch (AssertionError e){
            if (screenshot)
                Utils.takeScreenShot();
            Assert.fail();
        }

    }

    public static void myAssertThenFail(String a, String b){
        try {
            Assert.assertEquals(a, b);
        }catch (AssertionError e){
            if (BrowserConfig.takeScreenShot)
                Utils.takeScreenShot();
            Assert.fail();
        }

    }

    public static void takeScreenShot(){
        String filePath = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
        filePath = "ScreenShot/" + filePath + ".png";
        takeScreenShot(filePath);
    }


    public static void takeScreenShot(String filePath){
        TakesScreenshot scrShot =((TakesScreenshot) Driver.getDriver());
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filePath);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }




}
