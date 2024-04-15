package m28_string_class_part2;

public class KeyWorldSearch {

    public static void main(String[] args) {

        String text = " My name is Sara.";
        String keyworld = "name";
        boolean r = containskeyworld(text, keyworld);
        System.out.println(r);

        String result = "      ";
        System.out.println( result.isEmpty());
        System.out.println( result.isBlank());


    }

        public static Boolean containskeyworld(String text, String keyworld ){
            //text = text.toLowerCase();
           // keyworld = keyworld.toLowerCase();
            return text.toLowerCase().contains(keyworld.toLowerCase());
        }
        }
