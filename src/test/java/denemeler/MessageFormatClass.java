package denemeler;

import cucumber2.pages.TempTest;

import java.text.MessageFormat;

public class MessageFormatClass {

    public static void main(String[] args) {

        String strPattern = "Java {0}, dünyasi {1}, nedir {0}";

        String strFormated = MessageFormat.format(strPattern, "XXXXX", "YY");

        System.out.println(strFormated);

        TempTest tt = new TempTest();


    }

}
