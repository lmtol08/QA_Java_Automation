package OOPConcepts;

public class one {
    public static void main(String[] args) {
        int [] arr = {1,3,2,4,1,2,4,5,6};
        sequence(arr);
    }
    // method outside main
    // when you want to run declare in main
    public static boolean sequence(int[]arr){
        // position 2 = 0,1,2 stops last seq of 3
        //  while this is running we need to chck IF

        //position 1= 0 position 2 = 1 position 3= 2
        for (int i=0;i<arr.length-2;i++) {
            if (arr[i] == 1 && arr[i+1] == 2 && arr[i + 2] == 3){
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);

        return false;
    }
}




//true if sequence 1,2,3 is founs
//true if 1 is preceded by 0