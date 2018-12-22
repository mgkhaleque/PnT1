package MathProblems;

public class Factorial {
    public static void main(String [] args){

        //factorial of 5
        //using iteration

        int n = 5;
        int result = 1;
        for (int i =1; i<=n; i++) {
            result = result * i;
           System.out.println("The Factorial of 5 is: "+result);
        }

    }
}
