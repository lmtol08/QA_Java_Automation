package Exception;

import java.util.Scanner;

public class execptionHW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = 0;

        try {
            // Prompt the user to enter a sentence
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            // Check if the sentence is empty
            if (sentence.trim().isEmpty()) {
                throw new IllegalArgumentException("Empty sentence is not allowed.");
            }

            // Split the sentence into words based on spaces
            String[] words = sentence.split(" ");

            // Check for exceptionally long words
            for (String word : words) {
                if (word.length() > 50) {
                    throw new StringIndexOutOfBoundsException("Word exceeds 50 characters limit: " + word);
                }
                wordCount++;
                System.out.println("Word: " + word + ", Length: " + word.length());
            }

        } catch (IllegalArgumentException e) {
            // Hempty sentence exception
            System.out.println("Error: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            // Handle long word exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Display word count
            System.out.println("Total words in the sentence: " + wordCount);

            // Close the scanner
            scanner.close();
        }
    }
}


