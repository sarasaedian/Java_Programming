package m32_array_declaration;

public class ArrayLengh {

    public static void main(String[] args) {


        String[] name = {"James","Aaroy" , "yulia", "Hazel"};
         int lengthOfArray = name.length;
        System.out.println("Length Of Array =" + lengthOfArray);

         int lastIndex = lengthOfArray -1;
        System.out.println( name[lastIndex]);

        System.out.println(" ------------------");
        int[]  numbers = { 10,20,30,40,50,60,70};

        for (int i = lengthOfArray-1 ; i >=0 ; i--) {
            System.out.println(numbers[i]);

        }







        /*int lengthOfArray = name.length;
        System.out.println(" Length Of array = " + lengthOfArray);

        int lastIndex = lengthArray - 1;
        System.out.println( names[lastIndex]);
    }*/
}
}
