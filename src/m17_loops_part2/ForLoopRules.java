package m17_loops_part2;

public class ForLoopRules {

    public static void main(String[] args) {

        //1. avod infinite number of loops:
/*
        for( ; ; ) {
            System.out.println(" cydeo");

        }
        */
        //    for (int i = 0; i > -1; i++) //logically we have infinite loops



        // 2. Multiple variable of same type can be given in initialization

        for (int i = 1, j=10, k= 100 ; i < 11; i++, j+=10, k +=100) {
            System.out.println(i + "==" + j + "==" + k);
        }
            System.out.println("-----------------------------");
           // for ( i= 10;i<=120; i+=20)
              //  System.out.println(i);

        // 3. Re-assigning a variable in the  for loop

        int x;
        for (x = 0; x < 5; x++) {
            System.out.println( x);

        }
// 4.Loop varible can not used outside the for loop's body

        for (int i = 10; i <=120 ; i +=20 ) {
            System.out.println(i);

        }

      //  System.out.println(i);



    }
}