package logical.Statement;

public class LogicalOperator {
    public static void main(String[] args) {

        int value1 = 200;
        int value2 = 20;
        if((value1>value2) && (value1%2==0)) {
            System.out.println(value1 + " is bigger than " + value2 + " and it is even number");
        }else if((value1<value2) || (value1 % 2 !=0)){
            System.out.println(value2 + " is bigger than " + value1 + " and it is odd number");
        }else if(value1==value2){
            System.out.println(value2 + " is equals to " + value1);
        }else {
            System.out.println("There is no valid case");
        }

    }

}

