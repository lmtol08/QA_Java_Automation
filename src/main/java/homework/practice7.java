package homework;

public class practice7 {
    // Given a string, take the first 2 chars and
    // return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
    // If the string length is less than 2, use whatever chars are there.
    public static void main(String[] args) {
        String result = front2("kitten");
        System.out.println(result);

        result = front2("QAautomation");
        System.out.println(result);
        result = front2("I");
        System.out.println(result);
    }

    public static String front2(String str) {
        if (str.length() < 2) {
            return str + str + str;
            //  If the input string's length is less than 2,
            ////   it links the string with itself twice more.
        }
        // creating object
        String firstTwoChars = str.substring(0, 2);

        return firstTwoChars + str + firstTwoChars;
        //  it takes the first two characters, links them with the original string,
        ////   and then adds the extracted two characters at the end

    }
}

     //   In this code, the `front2` method takes a string as input. If the input string's length is less than 2,
//   it concatenates the string with itself twice.
//
//   Otherwise, it extracts the first two characters, concatenates them with the original string,
//   and then adds the extracted two characters at the end. The `main` method demonstrates the usage of the `front2` method with different input strings.

/*
public static String front22(String str) {
    int length = str.length();
    if (length < 2) {
        return str + str + str;
    } else {
        String firstTwoChars = str.substring(0, 2);
        return firstTwoChars + str + firstTwoChars;
    }
}

public static void main(String[] args) {
    String input = "kitten";
    String result = front22(input);
    System.out.println("Result: " + result);
 */

