package temp;

public class ReplaceTrim {

    public static void main(String[] args) {

        String s =  "      Hello World      ";

             s = s.trim();

        System.out.println(s);

        String str = " Apple Apple Apple";

       String str2 = str.replace( "Apple", " Cherry");

        System.out.println( str2);

    }
}
