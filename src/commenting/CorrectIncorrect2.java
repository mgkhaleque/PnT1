package commenting;

public class CorrectIncorrect2 {
    public static void main(String[] args) {

        correct();//This is a method call
        incorrect();
    }
    public static void correct() {
        System.out.print("Correct, great job!\n");
    }

    public static void incorrect() {
        System.out.print("Incorrect, try again!");
    }

}
