package Automation001;

public class homework {
    public static void main(String[] args) {
        in100(105);
        near10(8,13);
        multi35(33);
    }

    //Given an int n, return true if it is within 10 of 100 or 200. Note:
    // Math.abs(num) computes the absolute value of a number.
    public static boolean in100(int n){
        if (n >= 90 && n <= 110 || n >= 190 && n <= 210){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }

    // Given 2 int values, return whichever value is nearest to the value 10,
    // or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

    public static void near10(int a, int b){
        int diffa = Math.abs(10-a);
        int diffb = Math.abs(10-b);

        if (diffa < diffb){
            System.out.println(a);
        } else if (diffb < diffa) {
            System.out.println(b);
        }else {
            System.out.println(0);
        }
    }

    // Return true if the given non-negative number is a
    // multiple of 3 or a multiple of 5. Use the % "mod" operator
    public static boolean multi35(int num){
        if ((num % 3 == 0) || (num % 5 == 0) ){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }

    //Given 2 positive int values, return the larger value that is in the range 10..20
    // inclusive, or return 0 if neither is in that range.
    public static void largeInRange(int a , int b){
        if (a >= 10 && a <= 20) {
            if (b >= 10 && b <= 20) {
                System.out.println(Math.max(a, b));
            } else {
                System.out.println(a);
            }
        } else if (b >= 10 && b <= 20) {
            System.out.println(b);
        } else {
            System.out.println(0);
        }
    }


    //Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    public static void inRange(int a, int b) {
        System.out.println((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }
/*

1.Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
2. Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
3. Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
4. Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
5. Given 2 int values, return true if either of them is in the range 10..20 inclusive.
*/





        /*
        // Problem 1
        int n1 = 95;
        System.out.println(isWithin10Of100Or200(n1)); // Output: true

        // Problem 2
        int a = 3;
        int b = 12;
        System.out.println(nearestTo10(a, b)); // Output: 12

        // Problem 3
        int num = 15;
        System.out.println(isMultipleOf3Or5(num)); // Output: true

        // Problem 4
        int x = 15;
        int y = 25;
        System.out.println(largerInRange(x, y)); // Output: 15

        // Problem 5
        int p = 8;
        int q = 12;
        System.out.println(isInRange(p, q));
    }


    // Problem 1
    public static boolean isWithin10Of100Or200(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    // Problem 2
    public static int nearestTo10(int a, int b) {
        int diffA = Math.abs(10 - a);
        int diffB = Math.abs(10 - b);

        if (diffA < diffB) {
            return a;
        } else if (diffB < diffA) {
            return b;
        } else {
            return 0;
        }
    }

    // Problem 3
    public static boolean isMultipleOf3Or5(int num) {
        return num % 3 == 0 || num % 5 == 0;
    }

    // Problem 4
    public static int largerInRange(int x, int y) {
        if (x >= 10 && x <= 20 && y >= 10 && y <= 20) {
            return Math.max(x, y);
        } else if (x >= 10 && x <= 20) {
            return x;
        } else if (y >= 10 && y <= 20) {
            return y;
        } else {
            return 0;
        }
    }

    // Problem 5
    public static boolean isInRange(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }
}
*/
    }

