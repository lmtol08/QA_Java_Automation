package Exception;
import java.util.Scanner;
/*
Prompt the user to enter a sentence containing words separated by spaces.
Split the sentence into words based on spaces.

Implement exception handling to handle the following scenarios:
        If the user enters an empty sentence (no words), catch the IllegalArgumentExceptand displion ay an error message.
        If the user enters an exceptionally long word (e.g., longer than 50 characters), catch the StringIndexOutOfBoundsException and display an error message.
        Display the count and length of each word in the sentence.
        */


public class exceptionHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = 0;

        try {
            System.out.println("WORD COUNTER");

            // user enters a sentence
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            // Check if the sentence is empty
            if (sentence.trim().isEmpty()) {
                throw new IllegalArgumentException("Empty sentences are not allowed.");
            }

            // Splits the sentence into words based on spaces
            String[] words = sentence.split(" ");

            // Check for exceptionally long words
            for (String word : words) {
                if (word.length() > 50) {
                    throw new StringIndexOutOfBoundsException("Word exceeds 50 character limit: " + word);
                }
            }

            // Output the words
            System.out.println("Words in the sentence:");
            for (String word : words) {
                System.out.println(word);
                wordCount++;
            }
        } catch (StringIndexOutOfBoundsException | IllegalArgumentException innerException) {
            System.out.println("Exception: " + innerException.getMessage());
        } finally {
            scanner.close();
            System.out.println("Total words in the sentence: " + wordCount);
        }
    }
}