package random;

import java.util.Random;
/*Class exercise
The method is used to generate a random number between 0.0 and 1.0.
The range is: 0.0 =< Math.random < 1.0.
Different ranges can be achieved by using arithmetic operations.

This is a default method and accepts no parameter.
This method returns a double
The result will vary every time you call random() method.
*/

public class UseRandom {
    public static void main(String[] args) {
        int [] list = new int [1000];

        Random random = new Random();

        for (int j=0; j<list.length; j++) {
            list [j] = random.nextInt(1000);
        }

        for (int i=0; i<list.length;i++) {
            System.out.println(list [i]);
        }



    }

}
