package m32_array_declaration;

public class FindMaximumNumber {

    public static void main(String[] args) {

        int[] x1= { 8,110,11,15,20};
        int[] x2= { 18,10,3,15,40};

        System.out.println(maximumValue( x1));

        System.out.println(maximumValue( x2));

    }

    public static int maximumValue(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            System.out.println(" Array  iS empty");
            return 0;
        }
        int max = numbers[0];

        for (int number : numbers) {
                 if (number> max){

                  max  =number;

            }

        }
        return max;
    }
}
