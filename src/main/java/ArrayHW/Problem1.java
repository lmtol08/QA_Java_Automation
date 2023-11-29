package ArrayHW;

public class Problem1 {
    /*
    Sum of Array Elements: Write a method to calculate and return the sum of all elements in an integer array.
*/
    public static void main(String[] args) {

 int[] nums = {1, 2, 3, 4, 5};
        // call for the sum to perform the tasks the array calls
        int sum = sumofnums(nums);
        // sum of method
        System.out.println("Sum of array elements: " + sum);


    }

    public static int sumofnums(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}


