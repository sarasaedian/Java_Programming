package m21_methods_part2;

public class ParametersArgumentsIntro {

    public static void main(String[] args) {

        eligibleToVote( 25);

        int age = 16;

        eligibleToVote(age);
    }

        public static void eligibleToVote( int age){

            if (age >= 18) {

                System.out.println(" You are eligible to vote");

            } else {
                System.out.println(" you are not eligible for vote");

            }


        }
    }




