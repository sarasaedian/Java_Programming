package m18_loops_part3;

public class BranchingStatment_Return {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if (i == 3) {
                //break;

                return;
            }
            System.out.println(i);
        }
        System.out.println(" Hello World");
        System.out.println(" Hello Cydeo");
    }
}