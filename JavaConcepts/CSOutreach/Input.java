package JavaConcepts.CSOutreach;
import java.util.*;
public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

//        //INTEGER INPUT
//        System.out.print("Enter an integer: ");
//        //int n = 10;
//        int number = input.nextInt(); // reads an integer value
//        System.out.println("You entered: " + number);
//
//        //DOUBLE INPUT
//        System.out.print("Enter a decimal number: ");
//        double decimalNumber = input.nextDouble(); // reads a double value
//        System.out.println("You entered: " + decimalNumber);
//
//        //CHARECTER INPUT
//        System.out.print("Enter a character: ");
//        char character = input.next().charAt(0); // reads the first character of the input string
//        System.out.println("You entered: " + character);
//
//        //BOOLEAN INPUT
//        System.out.print("Enter true or false: ");
//        boolean value = input.nextBoolean(); // reads a boolean value
//        System.out.println("You entered: " + value);

        //STRING INPUT
        System.out.print("Enter your name: ");
        String name = input.next(); // Reads until a space or newline
        System.out.println("You entered: " + name);

        input.nextLine();

        System.out.print("Enter a line:");
        String line = input.nextLine(); // Reads until a newline
        System.out.println("You entered: " + line);

        //When using next() followed by nextLine(), the leftover newline character from next() can cause nextLine() to read an empty string.
        // To avoid this, you can add an extra nextLine() to consume the newline

        //next(): Stops reading at whitespace (space, tab, or newline).
        //nextLine(): Stops reading at a newline character.

    }
}
