package m32_array_declaration;

import java.util.Arrays;

public class Employeeinitials {

    public static void main(String[] args) {

        String[] names =  {"John Doe", "Alice Smith", "Robert Johnson"};

        String[] initials = findInitials(names);

        System.out.println(Arrays.toString(initials));


        System.out.println("------------------------------------------");



        String[] names2 = {"Daniel Arron", "Jimmy Joe", "Mike Jonathan", "Breanna King"};

        String[] initials2 = findInitials(names2);

        System.out.println(Arrays.toString(initials2));



    }

    public static String[] findInitials(String[] names){
        String[] initials = new String[names.length];

        for (int i = 0; i < names.length; i++) {

            initials[i] = names[i].charAt(0) + "" + names[i].charAt(  names[i].indexOf(" ") + 1 );
        }

        return initials;
    }
}
