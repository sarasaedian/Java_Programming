package week6;

public class StringReverce {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(" 12345"); //mutable class
        System.out.println(sb.reverse());


    }
///*
//
//    public static String reverse(String str) {
//
//        String reverse = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//
//            reverse += str.charAt(i); //reverse = reverse=str.charAt(i)
//
//        }
//
//
//*/
        //return reverse;

    }

 /*  public static String reverse2(String str) {

        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {

          reverse.append(str.charAt(i)); //reverse = reverse=str.charAt(i)
        }
return reverse;

}
/*


1. String Reverse & Palindrome Task:

    1.1 Create a method to reverse a given string and provide the reversed result.
          Example:
             reverse("Cydeo");
          Output:
             "oedyC"

    1.2 Create a method named isPalindrome to check if a given string is a palindrome.
        A string is palindrome if the characters are the same being read from the beginning or the end
          Example:
             isPalindrome("Level");
          Output:
             true

2. SortedOrder
    Create a method that accepts a String and returns a boolean.
        return true if the given String is sorted meaning the characters are in alphabetical order
        return false if the given String is not sorted

        Example:
            input: "abcd"
            output: true

            input: "abzy"
            output: false

3. Frequency of Characters Task:
    Write a program to display the frequency of each character in a given string.
        Example:
            str = "aabbbcccc"
        Output:
             a2b3c4

 */