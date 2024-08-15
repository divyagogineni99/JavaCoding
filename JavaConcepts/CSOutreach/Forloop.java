package JavaConcepts.CSOutreach;


//A for loop in Java is a control flow statement that allows you to repeat a block of code a specified number of times.
// It is typically used when you know beforehand how many times you want to iterate through a block of code.

//Syntax:
//  for (initialization; condition; increment/decrement) {
//    //code to be executed
//  }

//Initialization: This step is executed once at the beginning of the loop. It usually initializes one or more loop counters.
//Condition: This is the loop continuation condition. The loop is executed as long as this condition evaluates to true. If it evaluates to false, the loop terminates.
//Increment/Decrement: This step is executed after each iteration of the loop. It usually updates the loop counter.
public class Forloop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


//        //nested loops
//        for (int i = 1; i <= 3; i++) { // i = 1
//            for (int j = 1; j <= 3; j++) {
//                System.out.println("i: " + i + ", j: " + j);
//            }
//        }
    }
}
