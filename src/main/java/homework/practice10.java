package homework;

public class practice10 {
    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    // We are in trouble if they are both smiling or if neither of them is smiling.
    // Return true if we are in trouble.
    public static boolean areWeInTrouble(boolean aSmile, boolean bSmile) {
        //main method demonstrates the usage of the `areWeInTrouble` method with sample values for `aSmile` and `bSmile
    return (aSmile && bSmile) || (!aSmile && !bSmile);
    // both smiling (`aSmile && bSmile`) or if neither of them is smiling (`!aSmile && !bSmile`)
}


    public static void main(String[] args) {
        boolean aSmile = true;
        boolean bSmile = false;
        boolean trouble = areWeInTrouble(aSmile, bSmile);
        System.out.println("Are we in trouble? " + trouble);
    }
}
