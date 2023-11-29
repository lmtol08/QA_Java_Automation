package ArrayHW;

public class Problem9 {
    /*
    Find Missing Number: Given an array containing n
    distinct numbers taken from 0, 1, 2, ..., n, write a method to find the missing number.
     */
    public static void main(String[] args) {
        int[] nums = {3, 1, 0, 4, 6, 2};
        int missingNumber = findMissingNum(nums);
        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissingNum(int[] nums) {
        int n = nums.length;
        // Calculate the expected sum of the first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        // Calculate the actual sum of the elements in the array
        for (int num : nums) {
            actualSum += num;
        }

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }
}

