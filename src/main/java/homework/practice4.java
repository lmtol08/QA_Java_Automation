package homework;

public class practice4 {
    //We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
    public static boolean Teen(int num1, int num2, int num3) {
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }
    //in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

    // create object
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 20;
        int num3 = 18;
        boolean result = Teen(num1, num2, num3);
        System.out.println("At least one number is teen: " + result);
        //
    }
}
