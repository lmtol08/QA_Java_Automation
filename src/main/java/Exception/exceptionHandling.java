package Exception;
/*
handles runtime error so that the normal flow of application can be maintained

ANY ABNORNAL CONDITION IH YOUR  CODE
comes from the THROWABLE CLASS

                                THROWABLE CLASS ->
            EXCEPTION                    ERROR (MUST FIX)
            IOException               ... StackOverfolwError
            SQLexception              ... VirtualMachineError
            ClassNotFoundException    ... OutOfMemoryOutOfBoundException
                    RuntimeException
                        ArithmaticExceptioon
                        NullPointerException
                        IndexOutOfBoundException
                            ArrayOutOfBoundException
                            StringOutOfBoundException



    KEY WORDS:
    try  -- write code
    catch
    finally
    throw- throw exception- declare it may occur
    throws

 */
public class exceptionHandling {
    public static void main(String[] args) {
        /// anything wrong - handle it and keep going
        // we must know it for sure to write for exception
        try {
            int result = 5 / 0;
            //variable e
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("coderuns");

    try{
        int [] arr = new int[5];
    int value = arr [1];

    }catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("still running");
    }

    }
}
