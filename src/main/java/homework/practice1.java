package homework;

public class practice1 {
    public static void main(String[] args) {
            System.out.println("This is me.");

            byte num1= 99;
            short num2 = 7850;
            int num3 = 50000;
            long num4 = 2536541L;
            float num5 = 2.36f;
            double num6 =333.3654d;
            boolean bool = false;
            char ch = 'b';
            String str= "this is a string in java";

            System.out.println(num6);
            System.out.println(bool);


                // Problem 1
                int n1 = 95;
                System.out.println(isWithin10Of100Or200(n1)); // Output: true

                // Problem 2
                int a = 8;
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
                System.out.println(isInRange(p, q)); // Output: true
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





