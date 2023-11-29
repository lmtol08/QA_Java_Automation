package homework;
// checks if there is an "unlucky" 1 (1 immediately followed by 3) in the first 2 or last 2 positions of the given array:
public class ArrayTask2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 1, 3};
        int[] nums3 = {1, 3, 4, 1};
        System.out.println(hasUnluckyOne(nums1)); // Output: false
        System.out.println(hasUnluckyOne(nums2)); // Output: true
        System.out.println(hasUnluckyOne(nums3)); // Output: true
    }

    public static boolean hasUnluckyOne(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return false;
        }

        // Check the first 2 positions
        if ((nums[0] == 1 && nums[1] == 3)) {
            return true;
        }

        // Check the last 2 positions
        if (nums[length - 2] == 1 && nums[length - 1] == 3) {
            return true;
        }

        return false;
    }
}


    //    In this code, the `hasUnluckyOne` function takes an integer array as input and checks if there is an "unlucky" 1 at the first 2 positions
//    or the last 2 positions of the array. If found, the function returns `true`; otherwise, it returns `false`.

