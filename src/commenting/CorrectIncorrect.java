package commenting;

public class CorrectIncorrect {
    public static void main(String[] args) {
        correct("Maximus");//This is a method call
        incorrect ("Hector");//calling with a parameter

    }

    public static void correct(String name) {
        System.out.print("Correct " + name +", great job!\n" );

    }

    public static void incorrect (String name) {
        System.out.print("Incorrect " + name + ", try again!");
    }

}
