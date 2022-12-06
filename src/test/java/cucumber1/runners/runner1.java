package cucumber1.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
        features = {"src/test/resources/features/feature1.feature"},
        glue = {"cucumber/stepdefs"}
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
