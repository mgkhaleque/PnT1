package sorting;

public class ImplementSelectionSort2 {
    public static void main(String[]args){

        int a [] = {1,2,3,4,6,7,8,9,10};
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum=sum+a[i];
        }
        System.out.println(sum);

        int total = 0;
        for(int j=0;j<=10;j++){
            total=total+j;
        }
        System.out.println(total);
        System.out.println("Missing number is:------->" + (total-sum));


    }
}

