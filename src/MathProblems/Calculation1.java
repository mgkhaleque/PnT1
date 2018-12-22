package MathProblems;

//Add-Subtract

public class Calculation1 {
    int a = 35;
    int b = 85;
    int c = a+b;
    int d = b-a;

    public void Add() {
        System.out.println(c);
    }

    public String Subt() {// 'String'?
        System.out.println(d);
        return "ca"; // 'ca' ?
    }

    public static void main(String []args) {

        Calculation1 ca = new Calculation1();

        ca.Add();
        ca.Subt();


    }

}
