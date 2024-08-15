package JavaConcepts.CSOutreach;

public class Integerarray {
    public static void main(String[] args){
        // Array : an array is a data structure that can store a
        // fixed-size sequence of elements of the same data type.

        // Declaration
        int[] numbers;

        // Declaration and initialization
        int[] scores = {85, 90, 78, 92, 88};

        // Declaration with size, then initialization
        int[] counts = new int[5];
        counts[0] = 10;
        counts[1] = 20;
        counts[2] = 30;
        counts[3] = 40;
        counts[4] = 50;

        int[] count = {1, 2, 3, 4, 5};

        // Using array in a loop
        for (int i = 0; i < scores.length; i++) {
            //System.out.println("Score " + (i+1) + ": " + scores[i]);
        }

        //      *********************    2D array     ***********************       //

       //   Syntax : dataType[][] arrayName = new dataType[rowSize][columnSize];

        int[][] intArray = {
                {1, 2, 3}, // {00 , 01, 02}
                {4, 5, 6}, // {10, 11, 12}
                {7, 8, 9} // {20, 21, 22}
        };
        // intArray[0][0] = 1
        // intArray[0][1] = 2
        // intArray[0][2] = 3

        // intArray[1][0] = 4
        // intArray[1][1] = 5
        // intArray[1][2] = 6

        // intArray[2][0] = 7
        //intArray[2][1] =  8
        // intArray[2][2] = 9

        System.out.println("Integer 2D Array:");

        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col < intArray[row].length; col++) {
                System.out.print(intArray[row][col] + " ");
            }
            System.out.println();
        }


        int[][] matrix1 = {
                {1, 2},
                {3, 4}
        };

        int[][] matrix2 = {
                {5, 6},
                {7, 8}
        };


    }
}
