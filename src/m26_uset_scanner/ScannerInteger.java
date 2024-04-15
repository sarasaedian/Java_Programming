package m26_uset_scanner;

import java.util.Scanner;

public class ScannerInteger {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println(" Enter your first number : ");
        byte firstNum = input.nextByte();//byte

        System.out.println(" Enter your second number : ");
        short secondNum = input.nextShort(); //byte

        System.out.println(" Enter your third number : ");
        int thirdNum = input.nextInt();

        System.out.println(" Enter your forth number : ");
        long forthNum = input.nextLong();


        input.close();

        System.out.println( "firstNum = " + firstNum);
        System.out.println( "secondNum = " + secondNum);
        System.out.println( "thirdNum = " + thirdNum);
        System.out.println( "forthNum = " + forthNum);



    }
}
