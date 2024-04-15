package m17_loops_part2;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <10 ; i++) {
            for (int j= 0; j < 10; j++) {
                System.out.print( i + " * " +j + " = " + (i*j) + "   \t");


            }
            System.out.println();
        }
    }
}
