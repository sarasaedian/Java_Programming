package m26_uset_scanner;

import java.util.Scanner;

public class ScannerDecimals {

    public static void main(String[] args) {

        Scanner input = new Scanner ( System.in);

        System.out.println( " Enter your first decimal number :");
        float num1 =  input.nextFloat();

        System.out.println( " Enter your second decimal number :");
        double num2 =  input.nextDouble();

        System.out.println( " Enter True or False :");
        boolean r  =  input.nextBoolean();

        input.close();

        System.out.println(" Num1 = " + num1) ;
        System.out.println(" Num2 = " + num2) ;
        System.out.println(" r = " + r) ;

    }
}
