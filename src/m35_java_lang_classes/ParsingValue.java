package m35_java_lang_classes;

import java.lang.Integer;

public class ParsingValue {

    public static void main(String[] args) {

        String str = "a1b2cd%&H(7$%";
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                System.out.println(each);
            }
        }
            System.out.println( Integer.MIN_VALUE);
            System.out.println( Integer.MAX_VALUE);




        }



    }

