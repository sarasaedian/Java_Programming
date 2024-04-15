package m14_selection_statements_part1;

public class GreatesNumber {

    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 5;


        if (num1 > num2) {
            System.out.println(" num1 is greater than num2");
        } else if (num2 > num1) {
            System.out.println(" num2 is greater than num1 ");
        } else {
            System.out.println(" The num1 and num2 are equal");
        }
    }
}

