package JavaConcepts.CSOutreach;
public class Output {
    public static void main(String[] args) {
        // Variables for use in examples
        String name = "Alice";
        int age = 30;
        double height = 1.7500;

        // 1. print() - Outputs text without adding a new line
        System.out.print("Using print(): ");
        System.out.print("Hello ");
        System.out.print("World");
        // Add a newline for readability
        System.out.println();

        // 2. println() - Outputs text and adds a new line at the end
        System.out.println("Using println():");
        System.out.println("First line");
        System.out.println("Second line");

        // 3. printf() - Provides formatted output using format specifiers
        System.out.println("Using printf():");
        // %s for String, %d for int, %f for float/double, %.2f for 2 decimal places // 4.567
        System.out.printf("Name: %s, Age: %d, Height: %.2f meters\n", name, age, height);

        // More printf() examples
        // while using printf, you can use %n or \n for adding new line
        System.out.printf("Padding numbers: %05d\n", 42);  // Pad with zeros
        System.out.printf("Formatting floats: %.3f%n", Math.PI);  // 3 decimal places

    }
}
