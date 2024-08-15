package JavaConcepts.ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
        //Output: Arithmetic Exception occurs
        //        rest of the code


//*************************************************************************************************************************
        try{
            int a[]=new int[5];

            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
        //OUTPUT: ArrayIndexOutOfBounds Exception occurs
        //        rest of the code


//*************************************************************************************************************************
//try block contains two exceptions.
// But at a time only one exception occurs and its corresponding catch block is executed.
        try{
            int a[]=new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
        //OUTPUT: Arithmetic Exception occurs
        //rest of the code

//*************************************************************************************************************************
//In this example, we generate NullPointerException, but didn't provide the corresponding exception type.
// In such case, the catch block containing the parent exception class Exception will invoked.
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
        //OUTPUT: Parent Exception occurs
        //        rest of the code


//*************************************************************************************************************************
//to handle the exception without maintaining the order of exceptions (i.e. from most specific to most general)
        try{
            int a[]=new int[5];
            a[5]=30/0;
        } catch(Exception e) {
            System.out.println("common task completed");
        }
//        } catch(ArithmeticException e){
//            System.out.println("task1 is completed");
//        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("task 2 completed");
//        }
        System.out.println("rest of the code...");
        //OUTPUT: Compile-time error  ( so redline is showing)
        // i.e,
//        CatchBlock5.java:8: error: exception ArithmeticException has already been caught
//        completed");}
//                ^
//                CatchBlock5.java:9: error: exception ArrayIndexOutOfBoundsException has already been caught
//        n("task 2 completed");}
// ^
//         2 errors

    }
}
