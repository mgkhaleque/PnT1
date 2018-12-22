package MathProblems;
//
public class StringManupulation {

    public static void main(String[] args) {
        String str = "We are in Java Selenium class";//First attempt C was caps (result true) & in 2nd attempt c small letter (result false)
        String str1 = "We are in Java Selenium Class";

        System.out.println(str.length());//String length or total characters are 29

        System.out.println(str.charAt(7));// index number 7 is i

        System.out.println(str.indexOf('i'));//i is 7 index number (First position of i)

        System.out.println(str.indexOf('i',str.indexOf('i')+1));//2nd position of i

        System.out.println(str.indexOf('i', str.indexOf('i')+1)+ " & "+ (str.indexOf('i')));//both positions of i

        System.out.println(str.indexOf("_"));

        System.out.println(str.equals(str1));//Class c was small letter (result false)

        System.out.println(str.equalsIgnoreCase(str1));
        String date = "01-01-2019";//String (datee) replace
        System.out.println(date.replace("-", "/"));

        String x = "Hello";// String compiling
        String y = "World";
        int a = 100;
        int b = 200;
        System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y);


    }




}
