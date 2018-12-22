package SwapConcept;

public class SwapInt2 {
    public static void main(String[] args) {

        int x = 100;
        int y = 200;

       /* //using temp variable

        int temp;  //100
        temp = x;  //100
        x = y;     //200
        y = temp;

        System.out.println(x);
        System.out.println(y);


        // without using temp variable

        x = x+y; //300
        y = x-y; //100
        x = x-y; //200
        System.out.println(x);
        System.out.println(y);

       */

        // without using temp variable + operator

        x= x*y;  //20000
        y = x/y; //100
        x= x/y;  //200

        System.out.println(x);
        System.out.println(y);




    }
}
