package iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIterator {
    public static void main(String[] args) {

        List<String> stList = new ArrayList<String>();
        stList.add("NY");
        stList.add("PA");
        stList.add("NJ");


        Iterator it = stList.listIterator();
        System.out.println(it.next());

    }
}

/*
Iterator is a public interface provided by java.util package which belongs to Java Collections Framework.

Iterator contains three methods:
boolean hasNext(): It returns true if Iterator has more element to iterate.

Object next(): It returns the next element in the collection until the hasNext()method return true.
This method throws ‘NoSuchElementException’ if there is no next element.

void remove(): It removes the current element in the collection.
This method throws ‘IllegalStateException’ if this function is called before next( ) is invoked.

-------------------------------->

It allows us to traverse a collection such as a List(e.g. ArrayList, LinkedList) or a Set and access the data element of this collection.
An Iterator can traverse the collection only in forward direction using next() and hasNext() methods and remove the last element returned by the iterator, using remove() method.

Another object that is widely used for iterating a collection is ListIterator, which is a public interface extending the Iterator interface.
A ListIterator can traverse the collection in both directions by using the next() and previous() methods, find the index of the next or previous element of the collection by using the nextIndex() or previousIndex() methods, add a new element to any position in the collection by using add(E e) method and remove an element from any position in the collection by using remove(E e) method.*/