package homework;

public class practice5 {
    //Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
    public static void main(String[] args) {
        int num1 = 35;
        int num2 = 55;
        boolean result = agerange(num1, num2);
        System.out.println(result);
    }

    public static boolean agerange(int a, int b) {
        //return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
        boolean Range1 = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
        boolean Range2 = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
        return Range1 || Range2;
    }
}

