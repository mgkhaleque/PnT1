package MathProblems;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String []args){
        //Find out 50 Fibonacci numbers using Java

        int fibo [] = new int [50];

        for (int i = 0; i<50; i++){
            if (i<2){
                fibo[i]=i;
            }else{
                fibo[i]= fibo[i-2]+fibo [i-1];
            }//end of if else
        }//end of for loop

System.out.println(Arrays.toString(fibo));

    }//end main
}
