package Exception;

public class exceptionHandle {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[4]);
            int result = 10/0;
            System.out.println(result);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("the array is out of values:  " +e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("this is my code continued");

        }

        }

    }



