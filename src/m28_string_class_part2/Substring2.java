package m28_string_class_part2;

public class Substring2 {

    public static void main(String[] args) {

        String str = "Wooden spoon";

        String  firstWord = str.substring(0, str.indexOf(" "));

        System.out.println( " First word:  " + firstWord );

        String secondWord = str.substring(str.indexOf( " ")+1);

        System.out.println( "Second Word : " + secondWord );

        String r = str.substring( 5,12);
        System.out.println( r);

    }
}
