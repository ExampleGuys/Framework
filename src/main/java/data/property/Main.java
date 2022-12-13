package data.property;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class Main {

    public static ThreadLocal<Properties> props = new ThreadLocal<>();

    @BeforeTest
    public void beforeTest(){
        props.set(new Properties());
    }

    @Test
    public void test1(){
        props.get().put("a", "b");
    }

    @Test
    public void test2(){
        System.out.println(props.get().getProperty("a"));
    }

}
