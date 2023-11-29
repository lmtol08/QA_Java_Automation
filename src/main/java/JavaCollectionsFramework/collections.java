package JavaCollectionsFramework;

import java.util.*;

/*
What are Java collections? Java collections refer to a collection of individual objects that are represented as a single unit.
You can perform all operations such as searching,
sorting, insertion, manipulation, deletion, etc., on Java collections just like you do it on data.

ready made architecture

iterable interface         MAIN
    collectoin interface
                 List interface
                     arraylist class- DYNAMIC CAN AUTO RESIZE. THESE ARE MUTABLE. WE CONVERT ARRAY TO ARRAY LIST
                        implements list i terface
                        stores in order added to the collection. (can store string , int, char)
                        can also be randomly accessed
                     linkedlistclass
                        subclass of ArrayList
                        uses list interface
                        maintains insertions order of elment
                        fifo order of elemenrts
                        doubly linked list implementation of the list
                        stres elemts as nodes linked to previos ellement
                        not thread safev- not syncronized
                        faster than Array List for manipulation of the group of objects
                     vector class
                            usses a dynamic array to store the data elements
                            similar to array list but its synchronized and contains many more methods tht re not
                            //part of collwection framework

                     stack class

queqe interface
PRIORITY QUEQE CLASS
DEQUE INTERFACE
ARRAY DEQUE CLASS

SET INTERFACE
HASHSET CLASS
LINKED HASHSET CLASS
SORTED SET INTERFACE
    TREE SET

 */
public class collections {
    public static void main(String[] args) {
        // its a class so we make an object

        ArrayList<String> animals = new ArrayList<String>();

// add to list
        animals.add("liom");
        animals.add("lizard");
        animals.add("dog");

// REMOVE
        System.out.println(animals.get(1));
        animals.remove(1);
// IF IT HAS DOG PRINT YES
        if (animals.contains("dog")) {
            System.out.println("yes");

            for (String animal : animals) {
                System.out.println(animal);
                System.out.println("==================================================================================");
            }

            String[] fruits = {"Apple", "Pear"};

            //convert to list
            //stores as a heap of values instead of an organized list {[apple, orange]
            List<String> fixedSixeList = Arrays.asList(fruits);


            //convert to array list
            //you can add to this list
            ArrayList<String> arrayList = new ArrayList<>(fixedSixeList);

            arrayList.add("kiwi");
            arrayList.remove("Pear");
            arrayList.add("lemon");

            for (String fruit : fruits) {
                System.out.println(fruit);
            }


            for (String ar : arrayList) {
                System.out.println(ar);

                // made string into list
                //   made new lst to add and presents the new lit
            }
            // we create an object to add multiple primiive data types
            ArrayList<Object> exampleList = new ArrayList<>();
            exampleList.add(1);
            exampleList.add("love");
            exampleList.add(true);
            exampleList.add(2.33);

            System.out.println("Arraylist elements");
//  ===================== aOBJECT ==========================================
            for (Object elememt : exampleList) {
                System.out.println(elememt);
            }


            System.out.println(" +++++++++++++++++++++++++ ");
            // changes position 1 "love"to hate
            exampleList.set(1, "hate");
            for (Object elememt : exampleList) {
                System.out.println(elememt);
            }

            exampleList.get(3);


        }

        /*

        ===================== LINKED LIST  ==========================================


         */
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("apple");
        linkedlist.add("grape");
        linkedlist.add("pear");
        linkedlist.add("strawberry");


        System.out.println("linked list elements");
        for (String elememtal : linkedlist) {
            System.out.println(elememtal);
        }

        /// REMOVING FIRST ELEMENRT

        linkedlist.removeFirst();
        linkedlist.addFirst("poptart");
          // can do this in fifo NOT ARRAY LISTS
        linkedlist.removeLast();

        System.out.println("Aftrer manipultion of linkedlist");
        for (String elememtal : linkedlist) {
            System.out.println(elememtal);
        }


           /*

        ===================== VECTOR CLASS  ==========================================
        when i print initial size it defaults to original size but size can increase

        runs increments of 10
        add 11  == size becpmes 20



         */
      Vector <Integer> numbers = new Vector<Integer>();
      numbers.add(1);

        System.out.println(numbers.get(0));
        System.out.println("printingall elements in the vector");

        for(int number: numbers){
            System.out.println(number);
        }
        // if you have anything under 10 you will have to use trim to trim it to the appropriatre size
        // in crease the size but can have empty space
        //this creates spavce
      numbers .trimToSize();

        ///  STACK CLASS ////////

        Stack<String> stackOfCards = new Stack<>();
//get item at top with out removing
        //cardAtTop = stackOfCards.peak();
       // System.out.println(             "STACK PEEK()" + cardAtTop);
        System.out.println(             "current PEEK()" + stackOfCards);
    // add to top
        stackOfCards.push("Ace");
        stackOfCards.push("King");
        stackOfCards.push("Queen");
        stackOfCards.push("Jack");
        stackOfCards.push("Ten");
        stackOfCards.push("Nine");
        stackOfCards.push("Eight");
        stackOfCards.push("Seven");
        stackOfCards.push("Six");
        stackOfCards.push("Five");
        stackOfCards.push("Four");
        stackOfCards.push("Three");
        stackOfCards.push("Two");
        stackOfCards.push("One");
        stackOfCards.push("Ace");
        stackOfCards.push("King");
        stackOfCards.push("Queen");
        stackOfCards.push("Jack");
        stackOfCards.push("Ten");
        stackOfCards.push("Nine");
        stackOfCards.push("Eight");
        // check if stack is empty
        boolean isstackempty = stackOfCards.isEmpty();
        // find position of object
                int position = stackOfCards.search("Queen");
        //isize of the stacck
                int size = stackOfCards.size();

               // stackOfCards.  brings up all methods


        /*
                    SET INTERFACE
                    HASHSET- ONLY UNIQUE ELEMTS NO DUPLICATES
                    npy in order
         */


      Set<String> set = new HashSet<>();

      set.add("apple");
        set.add("grape");
        set.add("grape");
        set.add("pear");
        set.add("strawberry");


      System.out.println(set);
      System.out.println(set.size());
      System.out.println(set.contains("apple"));
      System.out.println(set.contains("grape"));
      System.out.println(set.contains("pear"));
      System.out.println(set.contains("strawberry"));
        System.out.println(set.remove("apple"));
        System.out.println(set.remove("grape"));
        System.out.println(set.remove("pear"));
        System.out.println(set.remove("strawberry"));

        System.out.println("=================================================================");

        /*
                LINKED HASHSET

                 COLLECTONN OF UNIQUE ELEMENTS
         */

        Set<String> set2 = new HashSet<>();
        set2.add("grape");
        set2.add("grape");
        set2.add("pear");
        set2.add("strawberry");


        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains("apple"));
        System.out.println(set.contains("grape"));
        System.out.println(set.contains("pear"));
        System.out.println(set.contains("strawberry"));
        System.out.println(set.remove("apple"));
        System.out.println(set.remove("grape"));
        System.out.println(set.remove("pear"));
        System.out.println(set.remove("strawberry"));








    }




}