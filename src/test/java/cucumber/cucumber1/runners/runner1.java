package cucumber.cucumber1.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
        features = {"src/test/java/cucumber1/features/feature1.feature"},
        glue = {"cucumber/cucumber1/stepdefs"}
)

//@RunWith(Cucumber.class)
public class runner1 extends AbstractTestNGCucumberTests {

    @BeforeTest
    public void beforeTest(){

    }

    @AfterTest
    public void afterTest(){

    }

}
