package m18_loops_part3;

public class BranchingStatmentIntro {

    public static void main(String[] args) {

        for (char i = 'A'; i < 'E'; i++) {

            System.out.println(i);
            if (i == 'C') {
                break;
            }
                System.out.println(i);

         }
        System.out.println("Hello");

        System.out.println("--------------------");
        for (int i = 1; i < 6; i++) {
            System.out.println(i);

        }
    }
}