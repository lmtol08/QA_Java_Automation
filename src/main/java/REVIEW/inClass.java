package REVIEW;

import javax.xml.transform.stream.StreamSource;
import java.security.spec.RSAOtherPrimeInfo;

public class inClass {
    public static void main(String[] args) {
        // tell me if a given number is greater then the other else
        // say falso
        //java can only print from main
        number(2, 3);
        sumofthree(5, 9, 8);
        newStrring("hiello");
        System.out.println(inBetween("hemeeeeerrr"));
}
    // declaring new class called "number" for integers a and b
    // to be called in the method
    //boolean is return type
    public static boolean number(int a, int b) {
        if (a > b || b > a) {
            System.out.println(true);
            return (true);
        } else {
            System.out.println(false);
            return (false);
        }
    }

    // sume of 3 numbers
    public static int sumofthree(int c, int d, int e) {
        int f = c + d + e;
        System.out.println(f);
        return f;
    }

    //  Given a string, return true if the string starts with "hi" and false otherwise.
    public static void newStrring(String str) {
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //Return true if the given string contains between 1 and 3 'e' chars.
    public static boolean inBetween (String str){
int count = 0;
for (int i = 0;i < str.length(); i ++){
if (str.charAt(i) == 'e');{
      count ++;
} if (count >3){
break;
}
      } return count >= 1 && count <=3;
    }
}
