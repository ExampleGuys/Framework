package cucumber1.pages;

import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utils.Driver;

public class BaseRunner {

    protected TestNGCucumberRunner testNGCucumberRunner;
    public static boolean runsWithRunner = true;


    @BeforeTest
    @Parameters("browser")
    public void beforeTest(@Optional("chrome") String browser){
        Driver.getDriver(browser);
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @AfterTest
    public void afterTest(){
        testNGCucumberRunner.finish();
        Driver.quitDriver();
    }
}
