package ArrayHW;

public class Problem2 {
    /*
    Find Maximum Value: Write a method to find and return the maximum value in an integer array.
     */
    public static void main(String[] args) {
        int[] nums = {1,2,8,9};
        // want  max of array
        int max = findMax(nums);
        // find max of array nums
      System.out.println("Max value in the array: " + max);
    }

    public static int findMax(int[] nums) {
        // Check if the array is empty
        if (nums.length == 0) {
            System.out.println("Array is empty");

        }

        // Initialize max of string to the first element of the array
        int max = nums[0];

        // Loop through the array to find the maximum value
        // i set to 1 i less than sumber length , incremented
        for (int i = 1; i < nums.length; i++)
        {
            //compares each element with the current `max`, and
            //        updates `max` if a larger element is found
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}


