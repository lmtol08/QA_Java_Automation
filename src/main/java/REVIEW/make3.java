package REVIEW;
//Given 2 ints, a and b,
// return true if one if them is 10 or if their sum is 10.//
//1. if a=10 or b=10 or a+b=10
//2. return true
public class make3 {
    public static void main(String[] args) {
        oneTen(1, 3);
    }

    public static boolean oneTen(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }

    }
}
