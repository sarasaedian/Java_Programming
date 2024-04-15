package m16_loops_part1;

public class SumOfEvenNumberAndOddNumber {
 
    public static void main(String[] args) {
        
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i <=10 ;i+=2) {
            sumEven +=i;

        }

        for (int i = 1; i <=10 ; i+=2) {
            sumOdd +=i;


        }
        System.out.println( " The Sum of even number is "  + sumEven);
        System.out.println( " The Sum of odd number is " +  sumOdd );
    }
}
