package JavaConcepts;

import java.util.Stack;

public class TestClass {
    public static void main (String[] args){

//    public void findIfPathTest() {

            int[][] matrix = {{1, 1}};

            Stack<TwoPointers.Pair> path = TwoPointers.findIfPath(matrix);
            System.out.println(path);
//        if(path == [(0,0),(0,1)]) {
//            System.out.println("Passed");
//        }

        }
    }

