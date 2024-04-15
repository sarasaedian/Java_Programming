package m16_loops_part1;

public class SumOfEvenOddnumberOneloop {

    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i <=10 ; i++) {

            if (i %2 ==0 ){
                sumEven +=i ;

            }else{
                sumOdd += i;
        }

    }

        System.out.println(" The sum of even is  " +  sumEven);
        System.out.println(" The sum of odd is  " +  sumOdd);
    }
}
