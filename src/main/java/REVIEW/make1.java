package REVIEW;

public class make1 {
    public static void main(String[] args) {
        sumDouble();
        // VOID METHOD W/ O ARGS
        sumDouble2(6, 5);
        // RESTRICTED TO THIS METHOD- NOT DYNAMIC
        sumDouuble3();
        sumDouuble4(8,7);
        // BEST PRACTICE

    }

    /*given two intss
        return the sum
                unless
                    tey are the same then double the sum*/
    public static void sumDouble() {
        //fixed
        int a = 10;
        int b = 5;
        if (a == b) {
            System.out.println((a + b) * 2);
        } else {
            System.out.println(a + b);

        }
    }

    // void without paremeters- pass dynamically fro main
    //best practice
    public static void sumDouble2(int a, int b) {
        if (a == b) {
            System.out.println((a + b) * 2);
        } else {
            System.out.println(a + b);

        }
    }

    // int method- pub static
    // return with in int
    // returns with memorty.
    //   unless you print the results
    public static int sumDouuble3() {
        int a = 10;
        int b = 5;
        if (a == b) {
            System.out.println((a + b) * 2);
            return (a + b) * 2;
        } else {
            System.out.println(a + b);
            return a + b;

        }
    }
        // method with return and parameters
    // call from main pass
    //int requires return
        public static int sumDouuble4( int a, int b){
            if (a == b) {
                System.out.println((a + b) * 2);
                return (a + b) * 2;
            } else {
                System.out.println(a + b);
                return a + b;

            }
        }
    }


