package stack;

import java.util.LinkedList;
import java.util.Queue;

// FIFO //

public class UseQueue {

    public UseQueue(){}

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.add("NY");
        queue.add("NJ");
        queue.add("VA");
        //System.out.println(queue.peek());

       // if (queue.peek().equalsIgnoreCase("NY")){
            System.out.println("First remove "+queue.remove());
        //}
        System.out.println("Peek as of now: "+queue.peek());
       // System.out.println(queue.peek());
    }

}
