package m26_uset_scanner;

import java.util.Scanner;

public class MistakeNext {

    public static void main(String[] args) {
        Scanner scanMe = new Scanner ( System.in);
                String firstName, lastName;

        System.out.println( " please Write first name?") ;
        firstName = scanMe.next();
        scanMe.nextLine();

        System.out.println( " please Write last name?") ;
        lastName = scanMe.nextLine();


        System.out.println(firstName + " " + lastName);
        scanMe.close();



    }


}
