package SwapConcept;

// String swap

public class SwapString {

    public static void main(String[] args) {
        String x = "Framework";
        String y = "Automation";

        //append x and y

        x = x+y; //FrameworkAutomation
        y = x.substring(0, x.length()-y.length());

        x = x.substring(y.length());
        System.out.println("value of x: "+x);
        System.out.println("value of y: "+y);


    }

}
