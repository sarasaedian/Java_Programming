package m22_methods_part3;

public class returnMethodpractice {

    public static void main(String[] args) {
         double result = calculate( 5 ,'+',3);
        System.out.println( " the Result is = " + result);

    }

    public static double calculate( double num1,char mathOperator, double num2){
         boolean validOperator = mathOperator == '+'|| mathOperator == '-'|| mathOperator == '*' || mathOperator =='%';

         if (!validOperator){
             return 0;
         }
         double result = ( mathOperator == '+')? num1 + num2 :( mathOperator== '-')?         num2 - num2 : (mathOperator== '*') ? num1 * num2 : ( mathOperator  =='/') ? num1 /num2 : num1 % num2;


         return result;

    }
}
