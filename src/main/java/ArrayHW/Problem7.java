package ArrayHW;

import java.util.HashMap;
/*
A HashMap however, store items in "key/value" pairs,
and you can access them by an index of another type (e.g. a String).

One object is used as a key (index) to another object (value).
It can store different types: String keys and Integer values, or the same type,

like: String keys and String values
 */

public class Problem7 {
    /*
    Duplicate Elements: Write a method to find and count duplicate elements in an integer array.
     */

    public static void main(String[] args) {
        int[] nums = {4, 1, 5, 7, 6, 9};
        DupesinString(nums);
    }

    public static void DupesinString(int[] nums) {
        // Create a HashMap to store element counts
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        // Count the occurrences of each element in the array
        for (int num : nums) {
            if (elementCountMap.containsKey(num)) {
                // If the element is already in the map, increment its count
                elementCountMap.put(num, elementCountMap.get(num) + 1);
            } else {
                // If the element is not in the map, add it with a count of 1
                elementCountMap.put(num, 1);
            }
        }

        // Print duplicate elements along with their counts
        System.out.println("Duplicate Elements in the Array:");
        for (int num : elementCountMap.keySet()) {
            if (elementCountMap.get(num) > 1) {
                System.out.println(num + " - Count: " + elementCountMap.get(num));
            }
        }
    }
}


