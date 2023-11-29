package Exception;
import java.util.Scanner;
public class ClasswrkToo {

    // USING NESTED TRACKAGE
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Begin.");

                try{
                System.out.print("Enter  value: ");
                String userInput = scanner.next();

                double number = Double.parseDouble(userInput);

                } catch (NumberFormatException innerException) {
                    System.out.println("Invalid!!!!" +innerException.getMessage());

                }
                System.out.println("===========================PART 2========================.");

                System.out.print("Enter first #: ");
                double numA = Double.parseDouble(scanner.next());
                System.out.print("Enter second #: ");
                double numB = Double.parseDouble(scanner.next());

                double result = (numA / numB);

                if (numB == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }

            } catch (ArithmeticException outerException) {
                System.out.println("More Execptions: "  +  outerException.getMessage());

            } finally {
                scanner.close();
                System.out.println("All These Exceptions");
            }
        }
    }


