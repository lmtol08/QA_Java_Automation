package REVIEW;

public class make2 {
//Given an int n, return the absolute difference between n and 21,
    // except return double the absolute difference if n is over 21.

    public static void main(String[] args) {
        absDifference(36,21);
    }

    //nums2 remains 21
    public static int absDifference(int n, int nums2) {
        ////given an int n,
        //    // return the absolute difference between n and 21,
        //    //n-21
        //
        //    // except return double the absolute diff if n is over 21
        //      //      if n>21
        //        //    return (n-21)*2
        if (n > nums2) { //n>21
         //   return double the absolute difference if n is over 21.
            System.out.println(Math.abs((nums2 - n) * 2));
            return Math.abs((nums2 - n) * 2);
        }else{
            ////given an int n,
            //    // return the absolute difference between n and 21,
            //    //n-21
            System.out.println(nums2-n);
            return (nums2-n);
        }
    }
}
