package OOPConcepts;

public class three {
    // triple s a value appearring 3 times in a row return true if the array does not contain ny triples
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,6,7,9,9,9,7,5};
        triples(nums);
    }
    public static boolean triples(int[]nums){
        //  while this is running we need to chck IF

        //position 1= 0 position 2 = 1 position 3= 2
        for (int i=0;i<nums.length-2;i++) {
            int first = nums[i];
            if (nums[i+1] == first && nums[i+2] == first) {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);

        return true;
    }
}
