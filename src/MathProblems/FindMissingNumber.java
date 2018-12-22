package MathProblems;

//using the same code

public class FindMissingNumber {
    public static void main (String []args){

        int []array = new int []{10,2,1,4,5,3,7,8,6};
        //array
        System.out.println(findMissing(array, 10));

    }

    public static int findMissing(int []array, int n){
        //mehtod overloaded

        int total = 0;
        int sum = 0;
        for (int i=0; i<n; i++){
            sum+=i;
        }
        for (int i=0; i<array.length; i++){
            total +=i;
        }
        return (sum - total);
    }
}
