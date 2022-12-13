package system;

import org.testng.annotations.Test;

public class Test1 {


    @Test
    public void test1(){
        //System.getProperties().forEach((k,v) -> System.out.println(k + " : " + v));
        System.out.println("usr.dir: " + System.getProperty("user.dir"));
        System.setProperty("my.name", "ahmet");
        System.out.println(System.getProperty("my.name"));
    }
}
