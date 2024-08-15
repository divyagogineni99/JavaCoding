package JavaConcepts.CSOutreach;

// Definition: Recursion is the technique of making a function/method call to itself.

// A real-world example:
/* Imagine you're searching for a book in a library:
 1)You start with the first shelf.
 2)If you find the book, great! You're done. [[[ BASE CASE ]]]
 3)If not, you move to the next shelf and repeat steps 1-3. [[[ RECURSIVE CASE ]]]
 4)You keep doing this until you either find the book or run out of shelves.

 */
public class Recursion {
    public static void main(String[] args) {
        int result = sum(3);
        System.out.println("Sum of numbers from 1 to 10: " + result);
    }

    // Printing the sum of 10 numbers using recursion
    public static int sum(int n) {
        // Base case: if n is 1, return 1 // KEY POINT: if no proper base case, there is a chance of infinite recursion, just like infinite loop.
        if (n == 1) {
            return 1;
        }
        // Recursive case: add n to the sum of numbers from 1 to n-1
        else {
            return n + sum(n - 1); // recursive call // sum() is being called by sum() recursively!!!
        }

//        When the sum() function is called, it adds parameter n to the sum of all numbers smaller than n and returns the result.
//        When n becomes 0, the function just returns 0.

//        When running, the program follows these steps:
        // 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1
        //  sum(10)
//        10 + sum(9)
//        10 + (9 + sum(8))
//        10 + (9 + (8 + sum(7)))
//        10 + (9 + (8 + (7 + sum(6))))
//        10 + (9 + (8 + (7 + (6 + sum(5)))))
//        10 + (9 + (8 + (7 + (6 + (5 + sum(4))))))
//        10 + (9 + (8 + (7 + (6 + (5 + (4 + sum(3)))))))
//        10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + sum(2))))))))
//        10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + sum(1)))))))))
//        10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + 1))))))))
//        Now, we've reached the base case (sum(1) = 1), so we can start calculating back up:
//        10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + 3)))))))
//        10 + (9 + (8 + (7 + (6 + (5 + (4 + 6))))))
//        10 + (9 + (8 + (7 + (6 + (5 + 10)))))
//        10 + (9 + (8 + (7 + (6 + 15))))
//        10 + (9 + (8 + (7 + 21)))
//        10 + (9 + (8 + 28))
//        10 + (9 + 36)
//        10 + 45
//        55
//
//        Since the function does not call itself when n is 0, the program stops there and returns the result.
    }

}
