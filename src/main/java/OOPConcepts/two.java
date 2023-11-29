package OOPConcepts;

public class two {

        public static void main(String[] args) {
            int [] arr = {1,3,2,1,2,0,1,2,4,5,6};
            insequence(arr);
        }
        // method outside main
        // when you want to run declare in main
        public static boolean insequence(int[]arr){
            // position 2 = 0,1,2 stops last seq of 3
            //  while this is running we need to chck IF

            //position 0= 0 position 1 = 1 position 2= 2
            for (int i=0;i<arr.length-2;i++) {
                if (arr[i] == 0 && arr[i+1] == 1 && arr[i + 2] == 2){
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
//}
