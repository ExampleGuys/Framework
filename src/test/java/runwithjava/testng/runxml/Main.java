package runwithjava.testng.runxml;

import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add("src/test/java/testng/sample2/testng.xml");
        testng.setTestSuites(suites);
        testng.run();
    }
}
