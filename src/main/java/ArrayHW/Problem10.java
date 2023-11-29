package ArrayHW;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;


public class Problem10 {
    /*
    Remove Duplicates: Write a method to remove duplicate elements from a sorted or
    unsorted integer array and return a new array without duplicates.
     */
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 2, 4, 3, 5, 1};
        int[] uniqueArray = removeDuplicates(nums);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));

    }

    public static int[] removeDuplicates(int[] nums) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        ArrayList<Integer> uniqueList = new ArrayList<>();

        // Add unique elements to the set and list
        for (int num : nums) {
            if (uniqueSet.add(num)) {
                uniqueList.add(num);
            }
        }

        // Convert ArrayList to int array
        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;
        }
















    }



