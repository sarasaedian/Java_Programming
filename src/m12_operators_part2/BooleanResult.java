package m12_operators_part2;

public class BooleanResult {


    public static void main(String[] args) {

         int b = 2;
         boolean result = (++b == 2 || b == 2) && --b == 2;

        System.out.println(result);
        System.out.println(b);
    }
}
