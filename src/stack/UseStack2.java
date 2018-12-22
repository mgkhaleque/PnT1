package stack;

// ExceptionHandling

import java.util.Stack;

public class UseStack2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("NY");
        stack.push("NJ");
        stack.push("VA");

        //if (stack.peek().equalsIgnoreCase("NY")){
            System.out.println(stack.pop());
        //}
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        }catch (Exception ex){
            //ex.printStackTrace();
            System.out.println("Stack is empty, no more palte");
        }
    }
}
