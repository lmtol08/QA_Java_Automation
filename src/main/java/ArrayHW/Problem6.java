package ArrayHW;

public class Problem6 {
    /*
    Array Reversal: Write a method to reverse the elements of an integer array
    without using any additional data structures.
     */
    public static void main(String[] args) {
        int[] nums = {6, 7, 8, 9, 10};
        reverseArray(nums);
        printArray(nums);
    }

    public static void reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        // Swap elements from start and end of the array until start index is less than end index
        while (start < end) {
            // Swap nums[start] and nums[end]
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move start index to the right and end index to the left
            start++;
            end--;
        }
    }

    public static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

