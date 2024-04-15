package m27_string_class_part1;

public class EachCharacter {

    public static void main(String[] args) {

        eachCharacter("");

    }

    public static void eachCharacter (String str){

        if ( str == null|| str.length()==0){
            System.out.println(" the text can not be null or empty");
        }
        for (int i = 0; i < str.length(); i++) {  //display each character of string
            System.out.println(str.charAt(i));
        }

    }
}
