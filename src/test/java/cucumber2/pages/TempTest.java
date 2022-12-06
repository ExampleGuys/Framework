package cucumber2.pages;

import org.testng.annotations.Test;
import testng.BaseTest;
import static cucumber2.pages.ButtonAction.*;

public class TempTest extends BaseTest {

    @Test
    public void test1(){

        ButtonAction buttonAction = ButtonAction.buttonAction();
        buttonAction.findByText("Home");
        buttonAction.click();
    }


    @Test
    public void test2(){
        buttonAction().findByText("Home").click();
        //buttonAction().findByText("Desktop", false).click();
        buttonAction().findByText("Download").click();
        buttonAction().findByText("Excel", false).click();
        buttonAction().findByText("Documents").click();

    }

    @Test
    public void testClickButton(){
        String url = "https://demoqa.com/checkbox";
        driver.get(url);
        driver.manage().window().maximize();
        test2();
    }



}
