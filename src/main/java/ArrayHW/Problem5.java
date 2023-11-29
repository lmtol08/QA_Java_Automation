package ArrayHW;

public class Problem5 {
    /*
    Array Sorting: Write a method to sort an integer array in ascending order using a sorting algorithm.
     */
    public static void main(String[] args) {
        int[] nums = {5, 2, 1, 7, 4, 0};
        Sort(nums);
        printArray(nums);
    }

    public static void Sort(int[] nums) {
        int length = nums.length;
        boolean sorted;

        for (int i = 0; i < length - 1; i++) {
            sorted = false;
            // Last i elements are already sorted, so no need to check them
            for (int j = 0; j < length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap if the current element is greater than the next element
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    sorted = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!sorted) {
                break;
            }
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

