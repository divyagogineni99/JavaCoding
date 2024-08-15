package JavaConcepts.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Leetcode {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,7};
        int target = 9;
        int[] result = twoSum(array,target);
        System.out.println(result[0] );
        System.out.println(result[1] );
       
    }

    public static int[] twoSum(int[] array, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int[] indexArray = new int[2];
        for(int i = 0; i< array.length ; i++) {
            if (map.containsKey(target - array[i])) {
                indexArray[0] = i;
                indexArray[1] = map.get(target - array[i]);
                return indexArray;
            }
            map.put(array[i], i);
        }
        return indexArray;
    }

}



