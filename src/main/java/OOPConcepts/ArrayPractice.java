package OOPConcepts;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] number = {3, 6, 5, 2, 4, 1};
        System.out.println(startend6(number));
    }
//ARRAY STATEMENT
    public static boolean startend6(int[] numbers) {
        // DECLARES BOOLEAN METHOS FOR VARIABLE STARTTOEND6 FOR THE INTEGER NAMED NUMBERS
        //constructor
        int length = numbers.length;
        //behVIOR
        return (numbers[0] == 6 || numbers[length - 1] == 6) && length >= 1;
    }

}


// checks if the first or last element is 6 and if the array length is 2 or mo

//public boolean firstlast(int[]nums){
   // return nums.length >= 1 && (nums[0] == 6 || nums[nums.length - 1] == 6);
//}


// given an array of ints length 3 return a new array with the  elements in reverse order
//so {123} is {321}

    /*
    public int[] resverse9int[]nums){
    int[] result = new int [3];
    //logic
        result [0] = num[2];
          result [1] = num[1];
            result [2] = num[0];

        return results;
        }




        GIVEN AN INT ARRAY LENGTH 2 RETURN TRUE IF IT DOES NOT CONTAIN 2 OR 3

        public static void main(String[] args) {
        int[] nums1 = {1, 4};
        int[] nums2 = {2, 3};
        //SETS INT STRING
        System.out.println(check23Array(nums1));
        System.out.println(check23Array(nums2));
        //CALLS METHOD TO PRINT
    }
                                 VARIBLE     ARRAY NAME
    public static boolean check23Array(int[] nums) {
        return (nums[0] != 2 && nums[0] != 3) && (nums[1] != 2 && nums[1] != 3);
                POSITION 1 NOT = 2 OR 3            POSITION 2 NOT = 2 OR 3

    }
}
```

In this code, the `checkArray` function takes an integer array of length 2 as input and checks if neither of the elements is 2 or 3. If both elements are not 2 and not 3, the function returns `true`; otherwise, it returns `false`.



     */
