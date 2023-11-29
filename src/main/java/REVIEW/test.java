package REVIEW;

public class test {
    public static void main(String[] args) {
        System.out.println("Multiple: " + isMultipleOf20(177));
                System.out.println("Add it: " + isPossible(8,7,4));
    }
    // Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.
    public static boolean isMultipleOf20(int number) {
        return number % 20 == 0 || number % 20 == 1;
    }

    // Given three ints, a b c, return true if it is possible to add two of the ints to get the third
    public static boolean isPossible(int a, int b, int c) {
        return a + b + c == 0;
    }

}
