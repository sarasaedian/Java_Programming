package m32_array_declaration;

public class SumOfOddNumbers {


    public static void main(String[] args) {

        int[] n1 = {2,4,7,9,35};
        int[] n2 = {4,2,7,43,23};

        System.out.println(SumOfOddNumbers (n1));
        System.out.println(SumOfOddNumbers (n2));


    }


        public static int SumOfOddNumbers ( int[] numbers){
            int sum = 0;

            for (int number : numbers) {
                if (number % 2 != 0) ;
                {
                    sum += number;
                }
            }


            return sum;

        }
    }
