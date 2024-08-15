package JavaConcepts.Graphs;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Definition for a Node.
class Node {

    // FIND A SUITABLE DATA STRUCTURE FOR INPUT AND OUTPUT INSTEAD OF MULTIDIMENSIONAL ARRAY
    public static void main(String[] args) {

        int[][] output = new int[3][3];
        int[][] input = {
                {2, 1},
                {2, 3},
                {2, 1, 3}
        };
//        for(int i=0; i<3 ; i++){
//            for(int j=0; j < input[i].length; j++){
////                System.out.println( "i :" + i);
////                System.out.println( "j :" + j);
////                System.out.println( "input[i][j] :" + input[i][j]);
//                output[i][(input[i][j])-1] = 1;
//            }
//        }
//        for(int i=0; i<3 ; i++) {
//            for (int j = 0; j < 3; j++) {
//                int temp = output[i][j];
//                if (temp == 1) {
//                    System.out.println(output[i][j]);
//                } else {
//                    output[i][j] = 0;
//                    System.out.println(output[i][j]);
//                }
//            }
//            System.out.println("\n");
//        }


        Map<Integer, ArrayList<Integer>> map2 = new HashMap<>();
        for(int i=0; i< 3  ; i++){
            ArrayList<Integer>[] neighbors = new ArrayList[input[i].length];
            neighbors[i] = new ArrayList<Integer>();
            for(int j=0; j < input[i].length; j++){
                neighbors[i].add(input[i][j]);

            }
            System.out.println("neighbors : " + neighbors);
            map2.put(i, neighbors[i]);
            System.out.println("MAP :" + map2);
        }

    }
}