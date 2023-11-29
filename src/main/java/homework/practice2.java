package homework;

public class practice2 {
    //Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    public static void main(String[] args) {

        System.out.println(doubleX("dfexxsd"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("pppoooxxx"));

    }

    public static boolean doubleX(String str) {
        //  `doubleX` takes a string as input, finds the index of the first occurrence of "x" using `indexOf('x'
        int indexOfFirstX = str.indexOf('x');
        if (indexOfFirstX == -1 || indexOfFirstX >= str.length() - 1) {
            return false;
           // checks if the index of the first "x" is within the string and if the character immediately following the first "x" is also "x"
        }
        return str.charAt(indexOfFirstX + 1) == 'x';
        //if both conditions are true, the function returns `true`, indicating that the first instance of "x" is immediately followed by another "x".
    }
}
/*
public static String stringTimes(String str, int n) {
    String result = "";

    for (int i = 0; i < n; i++) {
        result += str;
    }

    return result;
}

public static void main(String[] args) {
    String input = "abc";
    int n = 3;
    String result = stringTimes(input, n);
    System.out.println("Result: " + result);
}
public static boolean doubleX(String str) {
    int indexOfFirstX = str.indexOf('x');

    if (indexOfFirstX != -1 && indexOfFirstX < str.length() - 1) {
        return str.charAt(indexOfFirstX + 1) == 'x';
    }

    return false;
}

public static void main(String[] args) {
    String input = "axxbb";
    boolean result = doubleX(input);
    System.out.println("Result: " + result);
}
 */