package m21_methods_part2;

public class OddOrEven {

    public static void main(String[] args) {
        OddOrEven(111);
        OddOrEven(50);

        int a = 205;
        OddOrEven(a);

    }

    public static void OddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + "  number is Even");
        } else {

            System.out.println(number + "  number is Odd");
        }
    }

}
