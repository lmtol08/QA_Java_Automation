package homework;

public class ArrayTask1 {
    public static void main(String[] args) {
    int[] nums1 = {2, 3, 3};
    // set 3 to 0
    int[] nums2 = {2, 3, 4};
        // set 3 to 0

        // tells what results to pull
        int[] result1 = fixArray(nums1); // Output: [1, 0, 3]
    int[] result2 = fixArray(nums2); // Output: [2, 0, 4]

    // Printing the results
    printArray(result1);
    printArray(result2);
}

    public static int[] fixArray(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
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

/*
the `fixArray` function takes an array of length 3 as input. It iterates through the array and checks if there is a 2 immediately followed by 3. If found, it sets the element at the next index to 0.
Finally, the modified array is returned. The `printArray` function is used to print the elements of the array.
 */