package homework;

public class practice6 {
    //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public static void main(String[] args) {
        int a = 80;
        int b = 50;
        boolean result = equals10(a, b);
        System.out.println(result);
    }

    public static boolean equals10(int a, int b) {
        return (a == 10 || b == 10) || (a + b == 10);

        //any  must be or = to 10 to be true
    }
}
