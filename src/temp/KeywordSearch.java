package temp;
import java.lang.String;

public class KeywordSearch {

    public static void main(String[] args) {
        String text = "This is a sample text";
        String keyword = "sample";

        boolean containsKeyword = containKeyword(text, keyword);
        System.out.println("Does the text contain the keyword? " + containsKeyword);
    }

    public static boolean containKeyword(String text, String keyword) {
        text = text.toLowerCase();
        keyword = keyword.toLowerCase();

        return text.contains(keyword);


    }

}




