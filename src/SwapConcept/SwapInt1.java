package SwapConcept;

public class SwapInt1 {
    public static void main(String[]args){

        int value1 = 10;
        int value2 = 20;

        System.out.println("Before swapping: ");
        System.out.println(value1);
        System.out.println(value2);

        int temp = value1;
        value1=value2;
        value2= temp;

        System.out.println("After swapping: ");
        System.out.println(value1);
        System.out.println(value2);
    }
}
