package m20_method_part1;

public class MethodsIntro {

    public static void main(String[] args) {
        System.out.println(" Test stared");
        eat();
        walk();
        //MethodsIntro.play();
        play();
        System.out.println(" Test Completed");

    }

    public static void eat() {
        System.out.println(" I am eating");
    }

    public static void walk() {
        System.out.println(" I am walikng ");
    }

    public static void play() {
        walk();
        System.out.println(" I am playing ");
    }
}
