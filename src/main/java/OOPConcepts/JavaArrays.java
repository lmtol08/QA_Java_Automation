package OOPConcepts;

public class JavaArrays {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,60};
        // index:     0 1 2 3 4 5
// collection of similar data types
        // b/c we have to declare data types


        System.out.println( "Element Array index 0: " + num[0]);
        System.out.println( "Element Array index 1: " + num[1]);
        System.out.println( "Element Array index 5: " + num[5]);
        for (int i = 0; i<= num.length;i++){
            // increment until  there is value which is i
            // greater than = to i

            System.out.println( i);


        }
    }
}

