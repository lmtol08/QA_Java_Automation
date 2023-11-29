package homework;

public class Arraytask3 {
    public static void main(String[] args) {
        //If you have an array of integers with a length of 3,
        // you can calculate the sum of all the elements
        int[] nums = {1, 2, 3}; // Example array of ints
        int sum = sumElements(nums);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int sumElements(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

}