package logical.Statement;

public class Compare {

    public static void main(String[] args) {

        int value1 = 20;
        int value2 = 20;
        int value3 = 200;

        if (value1>value2) {
            System.out.println(value1+ "is bigger than"+value2);
        }
        else if (value1<value2) {
            System.out.println(value2+ " is bigger than "+value1);
        }
        else if (value1 == value2) {
            System.out.println(value2+ " is equal to "+value1);
        }

        if (value2>value3) {
            System.out.println(value2+ "is bigger than "+value3);
        }
        else if (value2<value3) {
            System.out.println(value3+ " is bigger than "+ value2);
        }
        else if (value2 == value3) {
            System.out.println(value3+ " is equal to "+value2);
        }
    }

}


