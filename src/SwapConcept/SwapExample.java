package SwapConcept;

public class SwapExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("value of a and b before swapping, a: " + a +" b: " + b);

//swapping value of two numbers without using temp variable
        a = a+ b; //now a is 30 and b is 20
        b = a -b; //now a is 30 but b is 10 (original value of a)
        a = a -b; //now a is 20 and b is 10, numbers are swapped

        System.out.println("value of a and b after swapping, a: " + a +" b: " + b);

//Output:
        //value of a and b before swapping, a: 10 b: 20
      //  value of a and b after swapping, a: 20 b: 10


        //Read more: https://javarevisited.blogspot.com/2013/02/swap-two-numbers-without-third-temp-variable-java-program-example-tutorial.html#ixzz5aQEGrbLO
    }
}
