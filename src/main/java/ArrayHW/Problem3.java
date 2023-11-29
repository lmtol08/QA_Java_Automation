package ArrayHW;

public class Problem3 {
    /*
    Find Minimum Value: Write a method to find and return the minimum value in an integer array.
     */
    public static void main(String[] args) {
        int[] nums = {2,55,4,3,7};
        int min = findMin(nums);
        System.out.println("Min value in the array: " + min);
    }

    public static int findMin(int[] nums) {
        // Check if the array is empty
        if (nums.length == 0) {
            System.out.println("Array is empty");
        }

        // Initialize min to the first element of the array
        int min = nums[0];

        // finds the minimum value
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}

