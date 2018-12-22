package Scanner;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter some integer value: ");
        int value = 2;
        int input = 0;
        while(value>0) {
            input = sc.nextInt();
            value --;
        }
        sc.close();
        int total = input + input;
        System.out.println(total);

    }


}
