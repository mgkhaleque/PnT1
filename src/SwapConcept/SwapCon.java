package SwapConcept;

// int swap

public class SwapCon {

    public static void main(String[] args) {
        int a= 10;
        int b = 20;

        //using + operator

        //	a = a+ b;//30
        //	b = a-b; //10
        //	a = a-b;//20

        //System.out.println(a);
        //System.out.println(b);

        //result a = 20, b = 10

        //using * operator

        a = a*b; //200
        b = a/b;
        a = a/b;
        System.out.println(a);
        System.out.println(b);

    }

}
