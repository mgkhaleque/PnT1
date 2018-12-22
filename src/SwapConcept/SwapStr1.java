package SwapConcept;

public class SwapStr1 {

    public static void main(String[] args) {

        String a = "Selenium";
        String b = "Java";

        System.out.println("Before Swapping");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);

        //append a and b
        a = a+b; //SeleniumJava

        //store initial String a in String b
        b = a.substring(0, a.length()-b.length());

        //store initial String b in String a
        a = a.substring(b.length());

        System.out.println("After Swapping");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
    }
}
