package m35_java_lang_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {

        System.out.println(" ------------Array----------");

        int[] array = new int[5];

        System.out.println(Arrays.toString(array));


        int[] array2 = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(array2));

        System.out.println(" ------------ArrayList----------");

        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(10, 20, 30, 40, 50) );

        System.out.println(list2);

    }
}
