package m12_operators_part2;

public class EligibleToDrive {
    public static void main(String[] args) {


        double age = 20.0;
        boolean hasLearningPermit = true;
        boolean hasDriverLicense = false;
        boolean result = ( age >= 18 && hasDriverLicense ) || ( age >=15.5 && hasLearningPermit);

        System.out.println( "Is mike eligible To drvie?  "   + result );

    }
}
