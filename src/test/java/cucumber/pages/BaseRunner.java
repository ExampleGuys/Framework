package cucumber.pages;

import cucumber.runners.runner2;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Driver;


@CucumberOptions(
        features = {"src/test/resources/features/feature2.feature"},
        glue = {"cucumber/stepdefs"}
)


public class BaseRunner {

    protected TestNGCucumberRunner testNGCucumberRunner;

    @BeforeTest
    public void beforeTest(){
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @AfterTest
    public void afterTest(){
        testNGCucumberRunner.finish();
        Driver.quitDriver();
    }
}
