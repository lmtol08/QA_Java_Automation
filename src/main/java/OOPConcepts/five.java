package OOPConcepts;

public class five {
    public static void main(String[] args) {
        //we need the sting and results and the call print resilts here
        String input = "Hxsxxxibkxx";

        //arr name and the input - their results
        String result = removeFirstTwoXX(input);
        System.out.println("Result: " + result);
    }

    //array tasks
    public static String removeFirstTwoXX(String str) {
        // Check if the input string starts with "xx"
        if (str.startsWith("xx")) {
            // Remove the first two chars ("xx") and return the remaining string starting at position 2
            return str.substring(2);
        } else {
            // If the input string does not start with "xx", return original
            return str;
        }
    }
}


