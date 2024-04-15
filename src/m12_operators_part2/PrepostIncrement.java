package m12_operators_part2;

public class PrepostIncrement {

    public static void main(String[] args) {

        int x = 10;
        int y  = 22;


        System.out.println(x++ + x);
//                           10   11     x = 11
        System.out.println(x++ + ++y);
        //                  11 + 23 + 34  x = 12 , y = 23

        System.out.println(++x % 5);
        //                  13 % 5 = 3 ,x = 13

    }
}
