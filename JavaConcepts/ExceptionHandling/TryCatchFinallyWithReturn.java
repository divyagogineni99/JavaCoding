package JavaConcepts.ExceptionHandling;

public class TryCatchFinallyWithReturn {
    public static void main(String args[]) {
        System.out.println(testingReturnInTryCatchFinally());
    }

    public static String testingReturnInTryCatchFinally(){
        try {
            //below code do not throw any exception
            int data = 25 / 0;
            System.out.println(data);
            //return "returning from Try";
        }
        //catch won't be executed
        catch (ArithmeticException e) {
            System.out.println("In catch block, ArithmeticException caught!");
            return "returning from Catch";
        }
        //executed regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
            return "returning from Finally";
        }

        //System.out.println("rest of phe code...");
        //return "returning from last";
    }
}
