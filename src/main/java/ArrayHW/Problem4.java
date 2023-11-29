package ArrayHW;

public class Problem4 {
    /*
    Array Rotation: Given an integer array,
    write a method to rotate the elements of the array to the right by a specified number of positions.
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        // number of positions to rotate
        int rotations = 3;
        // name    (variables)
        rotatenums(nums, rotations);
        printnums(nums);
    }

      // keeps original stri g while still outputting the rotation
    public static void rotatenums(int[] nums, int rotations) {
        int length = nums.length;
        int[] temp = new int[length];

        // Copy elements to temporary array after rotations
        for (int i = 0; i < length; i++) {
            temp[(i + rotations) % length] = nums[i];
        }

        // Copy elements back to original array
        for (int i = 0; i < length; i++) {
            nums[i] = temp[i];
        }
    }

    public static void printnums(int[] nums) {
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


