package JavaConcepts.ExceptionHandling;

public class FinallyBlock {
    public static void main(String args[]) {
//*************************************************************************************************************************
//When an exception does not occur

        try {
//below code do not throw any exception
            int data = 25 / 5;
            System.out.println(data);
        }
//catch won't be executed
        catch (NullPointerException e) {
            System.out.println(e);
        }
//executed regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of phe code...");



//*************************************************************************************************************************
//When an exception occurr but not handled by the catch block
        //Here, the code throws an exception however the catch block cannot handle it.
        // Despite this, the finally block is executed after the try block and then the program terminates abnormally.

        try {

            System.out.println("Inside the try block");

            //below code throws divide by zero exception
            int data=25/0;
            System.out.println(data);
        }
        //cannot handle Arithmetic type exception
        //can only accept Null Pointer type exception
        catch(NullPointerException e){
            System.out.println(e);
        }

        //executes regardless of exception occured or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");

//*************************************************************************************************************************
//When an exception occurs and is handled by the catch block
        //example where the Java code throws an exception and the catch block handles the exception.
        // Later the finally block is executed after the try-catch block.
        // Further, the rest of the code is also executed normally.

        try {

            System.out.println("Inside try block");

            //below code throws divide by zero exception
            int data=25/0;
            System.out.println(data);
        }

        //handles the Arithmetic Exception / Divide by zero exception
        catch(ArithmeticException e){
            System.out.println("Exception handled");
            System.out.println(e);
        }

        //executes regardless of exception occured or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");

    }
}
