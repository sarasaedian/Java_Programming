package m32_array_declaration;

public class ForEachloop {

    public static void main(String[] args) {

        int[] numbers = { 15, 30, 45, 75, 90};

        for( int  each : numbers ){
            System.out.println(each);

            System.out.println("------------------");
            String[] names = {"James","Aaroy" , "yulia", "Hazel"};

            for ( String name : names) {
                System.out.println(name);
            }

        }

    }
}
