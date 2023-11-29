package ArrayHW;

public class Problem8 {
    /*
    Even/Odd Count: Write a method to count the number of even and odd elements in an integer array.
     */
    public static void main(String[] args) {
        int[] nums = {40,33,2,7,5,9,88};
        EvenOdd(nums);
    }

    public static void EvenOdd(int[] nums) {
        int even = 0;
        int odd = 0;

        // Loop through the array and count even and odd numbers
        for (int num : nums) {
            //if the number divided by 2 has a remainder that equal to 0
            // its even and incremnt
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Print the counts of even and odd numbers
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
    }
}

