package m12_operators_part2;

public class Task2 {

    public static void main(String[] args) {

        int a = 10;
        a = --a + a++ + a-- + a++ ;
        System.out.println(a);
    }
}
