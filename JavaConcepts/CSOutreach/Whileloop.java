package JavaConcepts.CSOutreach;

//The while loop in Java is a control flow statement that allows code to be executed repeatedly based on a given boolean condition.
// The loop will continue to execute as long as the condition evaluates to true.

//SYNTAX:-
//while (condition) {
//        // code to be executed
// }
public class Whileloop {
    public static void main(String[] args) {
//        int i = 1; // Initialization
//        while (i <= 5) { // Condition
//            System.out.println("i: " + i); // Code to be executed
//            i++; // Increment
//        }

        // Sometimes we may forget to increment or decrement in while loop - causes INFINITE loop
        //int i = 1;
        //        while (i <= 5) {
        //            System.out.println("i: " + i);
        //            // Forgot to increment i, this will cause an infinite loop
        //        }

        //  ***************             break and continue          **************//
        //You can also use the break statement to exit the loop early based on a certain condition.
//        int i = 1;
//        while (true) {
//            System.out.println("i: " + i);
//            i++;
//            if (i > 5) {
//                break; // Exit the loop when i is greater than 5
//            }
//        }

        // The continue statement can be used to skip the current iteration and proceed to the next iteration.

//        int i = 0;
//        while (i < 10) {
//            i++;
//            if (i % 2 == 0) {
//                continue; // Skip even numbers
//            }
//            System.out.println("i: " + i);
//        }


        //    **************              Nested While Loop             ************* //

//        //nested loops
//        for (int i = 1; i <= 3; i++) { // i = 1
//            for (int j = 1; j <= 3; j++) {
//                System.out.println("i: " + i + ", j: " + j);
//            }
//        }

        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.println("i: " + i + ", j: " + j);
                j++;
            }
            i++;
        }
    }
}
