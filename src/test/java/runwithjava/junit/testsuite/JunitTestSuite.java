package runwithjava.junit.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import runwithjava.junit.Example1;
import runwithjava.junit.Example2;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Example1.class,
        Example2.class
})
class JunitTestSuite {
}
