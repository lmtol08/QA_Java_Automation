package homework;

public class practice {
    // Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    public static void main(String[] args) {
        String originalString = "Automation";
        int n = 6;
        String String1 = multipleCopies(originalString, n);
        System.out.println(String1);
        //  print the larger string that consists of `n` copies of the original string.
    }

    public static String multipleCopies(String str, int n) {
        //takes a string `str` and a non-negative integer `n` as input
        StringBuilder result = new StringBuilder();
       // `StringBuilder` to concatenate (link) `n` copies of the original string together
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
        //returns the resulting larger string.
    }

}


/*
public static int countXX(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
            count++;
        }
    }
    return count;
}

public static void main(String[] args) {
    String input = "xxx";
    int result = countXX(input);
    System.out.println("Number of 'xx' : " + result);
}
 */