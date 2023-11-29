package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.*;

/*
Iterator in Java is an object used to cycle through arguments or elements present in a collection. It is derived from the technical term “iterating,”
which means looping through. Generally,
an iterator in Java is used to loop through any collection of objects. To apply the iterator,.
 all you need to do is import the java.util package and then use the iterator() method.




Limitations of Iterator in Java
Iterators are useful to perform many operations in a collection, but there are also some drawbacks to it. The primary limitations of iterators in Java include:

It does not support backward direction iteration
It doesn’t enable you to add new elements to the collection
It does not support update operations on the collection

 */
public class interatorinJava {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<String>();

// add to list
        animal.add("liom");
        animal.add("pig");
        animal.add("dog");

        Iterator<String> animals = animal.iterator();
        // must use while - true or false.stop
        /*
         ===Different Methods Provided by Iterator in Java

1. boolean hasNext()
Checks for more elements and returns true, if found.

2. Object next()
It returns the next object or element in the collection. If no more elements are present, it throws a NoSuchElementException error.

3. void remove()
It can only be used after the next() method and removes the current object where the iterator is present.
If you try to call the remove() method without calling the next() method, it throws an IlegalStateException error.

         */
        while (animals.hasNext()) {
            // store in elemet and print
            String element = animals.next();
            System.out.println(animals.next());

        }
    }
}
