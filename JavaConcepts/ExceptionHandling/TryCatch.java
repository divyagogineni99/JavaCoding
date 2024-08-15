package JavaConcepts.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatch {
    public static void main(String[] args) {
        int a=4, b=0, c=0;

        try {
            c = a/b;
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This block is always executed.");
        }
        // Output: Array index is out of bounds!
        //         This block is always executed.

//*************************************************************************************************************************
        //Example to resolve the exception in a catch block.
        int i=50;
        int j=0;
        int data;
        try
        {
            data=i/j; //may throw exception
        }
        // handling the exception
        catch(Exception e)
        {
            // resolving the exception in catch block
            System.out.println(i/(j+2));
        }
        // Output: 25

//*************************************************************************************************************************
// Along with try block, we also enclose exception code in a catch block.
        try
        {
            int data1=50/0; //may throw exception

        }
        // handling the exception
        catch(Exception e)
        {
            // generating the exception in catch block
            int data2=50/0; //may throw exception

        }
        System.out.println("rest of the code");
        // Output: Exception in thread "main" java.lang.ArithmeticException: / by zero

//*************************************************************************************************************************
// handling the generated exception (Arithmetic Exception) with a
        // different type of exception class (ArrayIndexOutOfBoundsException).
        try
        {
            int data3=50/0; //may throw exception

        }
        // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
        // Output: Exception in thread "main" java.lang.ArithmeticException: / by zero

//*************************************************************************************************************************
// example to handle another unchecked exception.
        try
        {
            int arr[]= {1,3,5,7};
            System.out.println(arr[10]); //may throw exception
        }
        // handling the array exception
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
        // Output: java.lang.ArrayIndexOutOfBoundsException: 10
        //          rest of the code

//*************************************************************************************************************************
// example to handle checked exception
        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
// providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e);
        }
        System.out.println("File saved successfully");
        // Output: File saved successfully



    }
}
