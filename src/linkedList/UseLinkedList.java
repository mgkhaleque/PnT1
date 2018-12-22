package linkedList;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {
    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        list.add("NY");
        list.add("PA");
        list.add("NY");
        list.add("FL");

        // Iterator to traverse the list
        Iterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //remove parameter PA
        list.remove("PA");
        System.out.println("after removing node");
        it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
