package m12_operators_part2;

public class AND_Operators {


    public static void main(String[] args) {

        int a = 100;
        System.out.println(( a >0  ) & ( a < 200 ) );
        //                  true     &    true ====> true

        System.out.println(( a == 200  ) & ( a >50 ) );
         //                  false   &    true  =====> false


        System.out.println(( a < 1000) && ( a > -100)) ;
        //                      true  &&  true  =====> true

    }
}
