package m15_selection_statment_part2;

public class TernaryVote {
    public static void main(String[] args) {


        int age = 28;

        //string result;

        /*if ( age>= 18){

            ressult = " you are eligible to vote";
        }else {
            ressult = " you are not
            eligible to vote";
        }*/
        String result = ( age>= 18) ? " you are eligible to vote " : " you are not eligible to vote";
        System.out.println( result);
        }

    }

