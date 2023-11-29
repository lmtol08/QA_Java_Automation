package Exception;

import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        try {
            System.out.println("Enter Numerastor");
            int numerator = scanner.nextInt();

            System.out.println("Enter Denominator");
            int denominator = scanner.nextInt();

            int result = numerator /denominator;

            System.out.println(result);
// used= parent exception when you dont know
        } catch (Exception e){
            System.out.println(e.getMessage());

        } finally {
            scanner.close();
            System.out.println("the end");
        }
    }
    }


