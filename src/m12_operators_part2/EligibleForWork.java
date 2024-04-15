package m12_operators_part2;

public class EligibleForWork {

    public static void main(String[] args) {

        int age = 23;
         boolean isEligible = age >= 18 && age <= 65;
        System.out.println( "Am I eligible to work ?  " +  isEligible);

    }
}
