package Scanner;

import java.util.Scanner;


public class UseScannerArray {
    public static void main(String[] args) {
        int [] list = new int [10];
        Scanner sc = new Scanner (System.in);
        System.out.println("plz enter some Java integer value: ");

        for (int j=0; j<list.length; j++) {
            list [j]= sc.nextInt();
        }
        for (int i=0; i<list.length; i++) {
            System.out.println(list [i]);
        }
        sc.close();
    }


}
