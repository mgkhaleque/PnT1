package iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println("Iterator using while loop: ");
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()) {
            System.out.println("Next element: " + it1.next());
        }

        System.out.println("Iterator using for loop: ");
        for (Iterator<String> it2 = list.iterator(); it2.hasNext();) {
            System.out.println("Next element: " + it2.next());
        }

        System.out.println("List iterator (forward iteration): ");
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println("Next element: " + lit.next());

        }

        System.out.println("List iterator (backward iteration): ");
        lit = list.listIterator(list.size());
        while (lit.hasPrevious()) {
            System.out.println("Previous element: " + lit.previous());

        }

        lit.next();
        lit.add("One more element");
        System.out
                .println("Modified list after the insertion of the new element");

        System.out.println("Index of next element: " + lit.nextIndex());
        System.out.println("Index of previous element: " + lit.previousIndex());

        for (lit = list.listIterator(); lit.hasNext();) {
            System.out.println("Next element: " + lit.next());
        }

        lit.previous();
        lit.remove();

        System.out.println("Modified list after the removal of an element");
        for (lit = list.listIterator(); lit.hasNext();) {
            System.out.println("Next element: " + lit.next());
        }

    }
}

/*
Let’s explain the above code.

Firstly, we create an ArrayList of strings and we show two ways of iterating this ArrayList using the Iterator interface.
In order to traverse the collection we must first obtain an iterator in this specific collection.
Then, we use a loop mechanism which is valid as long as hasNext() method of the Iterator returns true.
This means that the collection has more elements and we haven’t reached the end of the collection.
In this example, we show how to use the iterator along with the loop mechanisms while and for loop.
In order to obtain each element of the ArrayList we use the next() method.
We can only traverse the ArrayList in forward direction.

Then we show how to use the ListIterator interface, so as to depict the differences and the enhanced capabilities of this interface in relation with the Iterator interface.
We iterate the arraylist in both directions and display the content of the ArrayList in each case.
Then, we add an element in next position of the current position of the iterator.
Specifically, the iterator from the backwards iteration is currently at the first index of the ArrayList, meanwhile at index 0.
So, by calling lit.next() we place the iterator at the second index of the ArrayList, so the new element will be added in that position.
Then, we display the index of next element and previous element.
Finally, we remove the last element that was returned by lit.previous(), which in this case was the last element in the list.
        */