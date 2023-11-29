package OOPConcepts;

public class four {
    public static void main(String[] args) {
        String input = "yakyakgdsffyaaaesgvdvsyakyak";
        String result = removeYak(input);
        System.out.println("Result: " + result);
    }

    public static String removeYak(String str) {
        // StringBuilder class can be used when you want to modify a string without creating a new object.
                StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            //finds a "y" then any character, and then a "k"- removing "yak")
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                // Skip "yak" and the character in between = position 3 (0,1,2,3)
                i += 3;
            } else {
                // Append the current character to the result
                result.append(str.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}


