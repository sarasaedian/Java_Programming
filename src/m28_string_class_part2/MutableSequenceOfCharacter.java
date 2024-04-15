package m28_string_class_part2;

import java.lang.String;

public class MutableSequenceOfCharacter {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder( " Java");

        stringBuilder.append(" programming" ) ;

        System.out.println( stringBuilder);

      //  stringBuilder.reverce();

      //  System.out.println( stringBuilder);

        String result = stringBuilder.toString();

        System.out.println( result);

        StringBuffer stringBuffer = new StringBuffer(" Java");

        stringBuilder.append( " programming");

        stringBuffer.reverse();

        String result2 = stringBuilder.toString();

        System.out.println(result2);




    }
}