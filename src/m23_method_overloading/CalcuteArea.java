package m23_method_overloading;

public class CalcuteArea {
    public static void main(String[] args) {
        double areaOfCircle = calculatearea( 2.5);
        System.out.println( " area of circle =" + areaOfCircle);

        double areaOfRectangle = calculatearea( 3.5, 4.5);
        System.out.println( " area of rectangle =" + areaOfRectangle);
    }

    public static double calculatearea(double radius) {
        // calculatinf area of circle
        return radius * radius * 3.14;
    }
    public static double calculatearea(double length, double width) {
        // calculatinf area of rectangle
        return length * width;
    }
    }
