package m21_methods_part2;

public class PassByValue {

    public static void main(String[] args) {

        displayCube(5);
        int a = 7;
        displayCube(a);

        System.out.println(" a = "+ a);


    }

    public static void displayCube( int num){

        System.out.println(" the number is :" + num);
        num = num * num * num;
        System.out.println(" Cube is :"  + num);
    }
}
