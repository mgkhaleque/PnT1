package Array;

import java.util.Random;

public class UseArray {

    public static void main(String[] args) {

        int [] array;
        array = new int[10];
        Random random = new Random();

        for (int i=0; i<array.length; i++){
            array[i]= random.nextInt(100);
        }
        for (int j=0; j<array.length; j++){
            System.out.println(array[j]);
        }
    }
}
