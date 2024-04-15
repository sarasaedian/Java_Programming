package m27_string_class_part1;
import java.lang.String;
public class EqualsMethodVsEqualOperator {

    public static void main(String[] args) {
         String str1 = " java";
         String str2 = " java";

        System.out.println( str1==str2);
        System.out.println( str1.equals( str2));

        String str3 = new String ( " java");
        String str4 = new String ( " java");

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

        System.out.println(str1.equals( str3));
        String str5 = " java";
        System.out.println(str1.equals(str5));

    }

}
