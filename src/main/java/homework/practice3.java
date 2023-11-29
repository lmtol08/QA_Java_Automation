package homework;

public class practice3 {
    //Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    public static void main(String[] args) {
        String input = "xxxxx";
        int count = overlapXX(input);
        System.out.println("Number of 'xx''s: " + count);
    }

    public static int overlapXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                //
                count++;
            }
        }
        return count;
        // Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
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

