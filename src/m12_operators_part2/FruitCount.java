package m12_operators_part2;

public class FruitCount {

    public static void main(String[] args) {

        int appleCount = 5;
        int orangeCount = 2;
        int straberryCount =1;

        boolean result = appleCount < orangeCount || orangeCount >= straberryCount;
        System.out.println( "result  = " + result );
    }
}
