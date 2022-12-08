package cucumber.run.feature.from.main;


import data.excel.ExcelFile;
import data.textfile.TextFile;

import java.util.List;

import static io.cucumber.core.cli.Main.run;

public class RunFeatureFromMain {
    public static void main(String[] args) {
        getFeatureFromExcel();

        String [] argv = new String[]{ "-g","","testOutput/feature1.feature"};
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        byte exitstatus = run(argv, contextClassLoader);
        System.out.println(exitstatus);
    }

    public static void getFeatureFromExcel(){
        ExcelFile.create("testOutput/excel.xlsx")
                .setHeader("Feature", "Scenario", "Steps")
                .writeData("F1", "S1", "Given user on homepage")
                .writeData("", "", "When  user search for \"mac\"")
                .writeData("", "", "Then  listed product count should be 4")
                .close();

        List<String> list = ExcelFile.read("testOutput/excel.xlsx").getColumn("Steps", 1);

        TextFile.create("testOutput/feature1.feature", true)
                .write("Feature: Future name")
                .write("Scenario: Scenario name")
                .write(list)
                .close();

    }

}
