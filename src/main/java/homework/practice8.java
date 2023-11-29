package homework;

public class practice8 {
    //Given a string, we'll say that the front is the first 3 chars of the string.
    // If the string length is less than 3, the front is whatever is there.
    // Return a new string which is 3 copies of the front.
    public static void main(String[] args) {
        //the front is the first 3 chars of the string.
        String input = "QAAUTO";
        String result = front3(input);
        System.out.println(result);
    }

    // Return a new string which is 3 copies of the front.
    public static String front3(String str) {
//        / If the string length is less than 3, the front is whatever is there.
        String front = str.length() >= 3 ? str.substring(0, 3) : str;
        //    // Return a new string which is 3 copies of the front.
        return front + front + front;
    }



}