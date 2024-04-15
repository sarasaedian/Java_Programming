package m26_uset_scanner;

import java.util.Scanner;

public class NextAndNextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your age :");
        int age = input.nextInt();//20Enter

        input.nextLine();

        System.out.println(" Enter your fullname :");
        String fullName = input.nextLine();

        input.close();

        System.out.println(" age = " + age);
        System.out.println(" fullName = " + fullName);


    }
}
