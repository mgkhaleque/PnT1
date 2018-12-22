package stack;

import java.util.Stack;

// LIFO //

public class UseStack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("NY");
        stack.push("NJ");
        stack.push("VA");

        //if (stack.peek().equalsIgnoreCase("VA")){//this method will give the same result?!
           // System.out.println(stack.peek());//this sys command will give the same result
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
       //}

    }
}
