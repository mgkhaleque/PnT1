package sorting;

public class ImplementSelectionSort {
    public static void main(String[] args) {

        //initialize un-sorted array
        int [] array = {9,7,8,6,4,1,5};
        for (int j=0; j<= array.length-1; j++){
            int min = j;
            for (int i= j+1; i <array.length; i ++){
                if (array [i] < array [min]){
                    min = i;
                }
            }
            //swapping
            int temp = array [min];
            array [min] = array [j];
            array [j] = temp;
        }
           // Print sorted array
        for (int n = 0; n < array.length; n ++){
            System.out.println(array [n]);
        }



    }
}
