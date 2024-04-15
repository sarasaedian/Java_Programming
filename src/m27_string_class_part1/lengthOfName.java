package m27_string_class_part1;

import java.util.Scanner;

public class lengthOfName {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);

        System.out.println( " Enter your first name :");
        String firstName = input.next();

        System.out.println( " Enter your last name :");
        String lastName = input.next();

        input.close();

        int total = firstName.length()+ lastName.length();
        System.out.println( "The total character of first name and last name is = " + total);




    }
}
