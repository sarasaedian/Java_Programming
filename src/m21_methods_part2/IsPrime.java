package m21_methods_part2;

public class IsPrime {

    public static void main(String[] args) {
        int num = 27;
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        } else {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }


            }

        }
    }
}
