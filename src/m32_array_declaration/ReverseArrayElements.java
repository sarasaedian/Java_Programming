package m32_array_declaration;

import java.util.Arrays;

public class ReverseArrayElements {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 11, 71};

    }
   /* public static int[] reversearray(int[] array) {
        String reversearray = new int[array.length];
    }*/
}
  /*  public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 11, 71};
        int[] result = reverseArray(numbers);

        System.out.println(Arrays.toString(result));

        double[] arr = {2.2, 4.4, 6.1, 11.1, 71.1};
        double[] result2 = reverseArray(arr);

        System.out.println(Arrays.toString(result2));

        String[] names = {"Java", " Phyton", " C#", "Ruby"};
        String[] result3 = reverseArray(names);

        System.out.println(Arrays.toString(result3));

    }

    public static int[] reverseArray(int[] array) {

        if (array.length <= 1) {
            return array;
        }

        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reversedArray[j] = array[i];
        }
        return reversedArray;
    }

    public static double[] reverseArray(double[] array) {

        if (array.length <= 1) {
            return array;
        }

        double[] reversedArray = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reversedArray[j] = array[i];
        }
        return reversedArray;
    }

    public static String[] reverseArray(String[] array) {

        if (array.length <= 1) {
            return array;
        }

        String[] reversedArray = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reversedArray[j] = array[i];
        }
        return reversedArray;
    }


}



*/