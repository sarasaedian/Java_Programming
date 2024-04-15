package m18_loops_part3;

public class LableStatement {

    public static void main(String[] args) {

        for (int j = 1; j < 6 ; j++) {
            System.out.print( j + " : ");

            for ( char i='A'; i< 'E'; i++){

                if (j == 3) {
                    break;
                }
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }
}
