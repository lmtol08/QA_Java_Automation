package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class MergeListsChallenge {


    public static void main(String[] args) {
        // Step 1: Create an ArrayList and populate it with integers
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        // Step 2: Create a LinkedList and populate it with integers
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);

        // Step 3 and 4: Merge and remove elements
        //LinkedList<Integer> result = mergeAndReduce(arrayList, linkedList);
        LinkedList<Integer> mergedList = new LinkedList<>(arrayList);
        mergedList.addAll(linkedList);

// Remove every second element from the merged
//i =1 an i less = to size of the merge list (the end)for the second position in the string
// remove
        for (int i = 1; i < mergedList.size(); i += 2) {
            mergedList.remove(i);
        }

        // Step 5: Print the final LinkedList
        System.out.println(mergedList);
    }
}

