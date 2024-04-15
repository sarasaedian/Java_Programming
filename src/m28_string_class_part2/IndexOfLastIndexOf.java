package m28_string_class_part2;

public class IndexOfLastIndexOf {
    public static void main(String[] args) {

        String str = "Java programming Language ";

        int indexOfFistA = str.indexOf( "a");
        System.out.println( " indexOfFirstA = " + indexOfFistA);

        int indexOfSecondA = str.indexOf( "a programming");
        System.out.println( " indexOfSecondA=" + indexOfSecondA);

        int indexOfThirdA = str.indexOf( "a",5);
        System.out.println( " indexOfThird =" + indexOfThirdA);

        int indexOfForthA = str.indexOf( "a",indexOfThirdA+1);
        System.out.println( " indexOfForth =" + indexOfForthA);






    }


}
