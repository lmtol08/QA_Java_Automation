package OOPConcepts;

public class six {
//new string made of every other character, starting with the first character of the input string
    public static void main(String[] args) {
        String input = "HelloByklmkrdjkejrgkjetoie";
        String result = getEveryOtherChar(input);
        // print results from string builder
        System.out.println("Result: " + result);
    }

    public static String getEveryOtherChar(String str) {
        // StringBuilder class can be used when you want to modify a string without creating a new object.

        StringBuilder result = new StringBuilder();
        //appends every other character to the `result` StringBuilder using the index `i += 2`  ie.  "i+=1"  would be every
        for (int i = 0; i < str.length(); i += 2) {
            // Append every other character to the result string
            result.append(str.charAt(i));
        }
       // returns the  string made of every other character
        return result.toString();
    }
}
