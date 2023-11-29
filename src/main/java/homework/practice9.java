package homework;

public class practice9 {
    //Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    public static boolean Temperature(int temp1, int temp2) {
    return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
}
//Argument to test -- create object
    public static void main(String[] args) {
        int temperature1 = -40;
        int temperature2 = 96;

        // create object
        boolean isValid = Temperature(temperature1, temperature2);
        System.out.println("One temperature less than 0 and the other greater than 100: " + isValid);
    }
}

