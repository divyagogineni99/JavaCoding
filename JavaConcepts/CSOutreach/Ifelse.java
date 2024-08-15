package JavaConcepts.CSOutreach;

public class Ifelse {
    public static void main(String[] args) {
        // Basic if-else statement
        int number1 = 10;
        if (number1 > 0) {
            System.out.println("number1 is positive.");
        }else {
            System.out.println("number1 is not positive.");
        }

        // if-else-if ladder
        int number2 = 0;
        if (number2 > 0) {
            System.out.println("number2 is positive.");
        } else if (number2 < 0) {
            System.out.println("number2 is negative.");
        } else {
            System.out.println("number2 is zero.");
        }

        // Nested if-else statement
        int number3 = 20;
        if (number3 > 0) {
            if (number3 % 2 == 0) {
                System.out.println("number3 is positive and even.");
            } else {
                System.out.println("number3 is positive and odd.");
            }
        } else {
            System.out.println("number3 is not positive.");
        }
    }
}
