package m32_array_declaration;

import java.sql.Array;
import java.util.Arrays;

public class ArrayDeclaration {

    public static void main(String[] args) {

        int[] scores;
        scores = new int[4];

        scores[0] = 85;
        scores [1] = 95;
        scores [2] = 90;
        scores [3] = 97;

        System.out.println(Arrays.toString(scores));

        System.out.println(( scores[0]));
        System.out.println(( scores[1]));
        System.out.println(( scores[2]));
        System.out.println(( scores[3]));

        System.out.println("-----------------------");

        //String[] name;
        //name = new String[5];

        String[] name = { "Java","Rubby","Phyton ", "C# ", "C++" };

        System.out.println(Arrays.toString(name));
        System.out.println(name.length);



    }
}
