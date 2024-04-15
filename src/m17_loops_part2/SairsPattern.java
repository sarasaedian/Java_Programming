package m17_loops_part2;

public class SairsPattern {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" " );

            }
            System.out.println("#");
        }
    }
}
