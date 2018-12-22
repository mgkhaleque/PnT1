package MathProblems;

public class FactorialR {

    public static void main(String []args){
        //Factorial of 5
        //using Iteration
        int n = 5;
        int result =1;
        for (int i=1; i<=n;i++){
            result = result * i;
            System.out.println("The Factorial variable is: "+result);
        }

        //Factorial of 5
        //using Recursion
    }
    public static int factorial(int n){
        if (n==0){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
}
