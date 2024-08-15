package JavaConcepts.CSOutreach;

public class Datatypes {
    public static void main(String[] args) {
//        // Java VARIABLE is a name given to a memory location.
//        // The value stored in a variable can be changed during program execution.
//
//        // int
//        // Declare :- dataType varibale;
//        int age = 25;
//        System.out.println("Age: " + age);
//
//        // long
//        long population = 7_000_000_000L; // Note the 'L' suffix
//        System.out.println("World Population: " + population);
//
//        // double
//        double pi = 3.14159265358979;
//        System.out.println("Value of Pi: " + pi);
//
//        // float
//        float temperature = 98.6f; // Note the 'f' suffix
//        System.out.println("Body Temperature: " + temperature + " °F");
//
//        // boolean
//        boolean isStudent = true;
//        System.out.println("Is Student: " + isStudent);
//
//        // char
//        char grade = 'A';
//        System.out.println("Grade: " + grade);
//
//        // String - 'S' is Upper Case
//        String name = "John Doe";
//        System.out.println("Name: " + name);


        //////////////////////  ********   STRINGS   ********   /////////////////////////

        // Strings : Strings are the type of objects that can store the character of values

        // Using String literal
        String str1 = "Hello";

        // Using new keyword
        String str2 = new String("Hello");

        // Using char array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        // Convert string to char array
        char[] charArray1 = str3.toCharArray();

        // Using StringBuilder and converting to String
        StringBuilder sb = new StringBuilder("Hello");
        String str4 = sb.toString();

        // 2. Demonstrating Immutability
        String immutableStr = "Hello";
//        immutableStr.concat( " World" ) ; // This creates a new String object
//        System.out.println("immutableStr : " + immutableStr );
        // The below line also creates a new String object, But if we explicitly assign it to the reference variable, it will refer to the “Hello World” object.
//        immutableStr = immutableStr + " World";
//        System.out.println("immutableStr : " + immutableStr );

        // 3. Using StringBuilder for mutable string
        StringBuilder mutableStr = new StringBuilder("Hello");
        mutableStr.append(" World"); // Modifying the same object
        System.out.println("Mutable Strings : " + mutableStr.toString()); // Outputs: Hello World

        // 4. Using StringBuffer (synchronized, thread-safe)
        StringBuffer threadSafeStr = new StringBuffer("Hello");
        threadSafeStr.append(" World");
        System.out.println(" StringBuffer : " + threadSafeStr.toString()); // Outputs: Hello World








    }
}
