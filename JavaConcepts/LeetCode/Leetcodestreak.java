package JavaConcepts.LeetCode;
import java.util.*;
import java.lang.*;
//import java.util.Map;

public class Leetcodestreak {
    public static void main(String args[]){
        //sequentialDigits(100, 1000);
        int[] nums = {1,1,2,2,3};
        int k=2;
        //int result = maxFrequencyElements(nums);
        //System.out.println(result);

        //System.out.println(OneMaxFrequencyElement(nums));
        //System.out.println(nMaxFrequencyElements(nums));
        System.out.println(kMaxFreqElements(nums,k));

    }
    public static HashMap<Integer, Integer> kMaxFreqElements(int[] nums, int k){
        // k Max frequent elements
        // EG:
        // Test case1 :- [1,1,1,2,2,3] , k=2, o/p:- 2,3 (any order)
        // Test case2 :- [1,1,2,2,3] , k=2, o/p:- 1,2 (any order)
        // Test case1 :- [1,1,1,2,2,3] , k=3, o/p:- 1,2,3 (any order)
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        LinkedHashMap<Integer,Integer> newMap = new LinkedHashMap<>();
        ArrayList<Integer> arrList = new ArrayList<>();
        int val=0, maxValue=0;
        for(int i=0; i<nums.length; i++){
            if(!(map.containsKey(nums[i]))){
                map.put(nums[i], 1);
            } else{
                val = map.get(nums[i]);
                val +=1;
                map.put(nums[i], val);
                if (maxValue < val) {
                    maxValue = val;
                }
            }
        }
        //System.out.println(map);
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            //int key = entry.getKey();
            int value = entry.getValue();
            arrList.add(value);
            Collections.sort(arrList, Collections.reverseOrder());
            // (Girl g1, Girl 2) => (g1.weight-g2.weight)
            System.out.println(arrList);
        }
            for( int j : arrList) {
                if (k != 0) {
                    System.out.println("k : " + k);
                    int key = map.get(j);

                    //map.remove(key);
                    System.out.println("key : " + key);
                    newMap.put(key, j);
                    k--;
                }
            }
        return newMap;
    }


    public static int OneMaxFrequencyElement(int[] nums) {
        // Top most frequency element, if more than 1, return first one
        int val, maxCount = 1;
        boolean maxFreqElementFound = false;
        int maxFreqElement = 0;
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!(map.containsKey(nums[i]))) {
                map.put(nums[i], 1);
            } else {
                val = map.get(nums[i]);
                val = val + 1;
                map.put(nums[i], val);
                if (maxCount < val) {
                    maxCount = val;
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value == maxCount && maxFreqElementFound == false) {
                maxFreqElement = entry.getKey();
                maxFreqElementFound = true;

            }
        }
        return maxFreqElement;
    }

    public static HashMap<Integer, Integer> nMaxFrequencyElements(int[] nums) {
        // Top most frequency elements, if more than 1, return all
        int val, maxCount = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!(map.containsKey(nums[i]))) {
                map.put(nums[i], 1);
            } else {
                val = map.get(nums[i]);
                val = val + 1;
                map.put(nums[i], val);
                if (maxCount < val) {
                    maxCount = val;
                }
            }
        }
        //System.out.println(maxCount);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // HashMap Iterator using for
            int key = entry.getKey();
            int value = entry.getValue();
            if(value == maxCount){
                newMap.put(key, value);
                //System.out.println(newMap);
            }
        }
        return newMap;
    }


    public static int maxFrequencyElements(int[] nums) {
        int val,maxCount=1;
        int maxFrequencyCount = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!(map.containsKey(nums[i]))) {
                map.put(nums[i], 1);
            } else {
                val = map.get(nums[i]);
                val= val +1;
                map.put(nums[i], val);
                if(maxCount < val){
                    maxCount = val;
                }
            }
        }
        System.out.println(map);
        System.out.println(maxCount);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // HashMap Iterator using for
            int value = entry.getValue();
            if(value == maxCount){
                maxFrequencyCount += value;
            }
        }
//        for (Integer key : map.keySet()) {  // HashMap Iterator using for, another way
//            int value = map.get(key);
//            if(value == maxCount){
//                maxFrequencyCount += value;
//            }
//        }
        return maxFrequencyCount;
    }


    public static int returnToBoundaryCount(int[] nums) {
        //Stack<Integer> stack = new Stack<Integer>();
        //stack.push(Integer.MAX_VALUE);
        int count=0, boundary = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] >0 ){
                int rightPointer = nums[i];
                for(int j=0; j< rightPointer; j++){
                    count++;
                    System.out.println("In +ve" +count);
                }
                if(count==0){
                    boundary++;
                    //return 1;
                }
            }else{
                int leftPointer = -(nums[i]);
                for(int k=0; k< leftPointer; k++){
                    count--;
                    System.out.println("In -ve" +count);
                }
                if(count==0){
                    boundary++;
                    //return 1;
                }
            }
        }

        return boundary;
    }







    public static List<Integer> sequentialDigits(int low, int high) {
        //1291. Sequential Digits

        //Example 1:
        //Input: low = 100, high = 300
        //Output: [123,234]

        //Example 2:
        //Input: low = 1000, high = 13000
        //Output: [1234,2345,3456,4567,5678,6789,12345]
        List<Integer> result = new ArrayList<>();
        String totalDigits = "123456789";
        int lowLength= String.valueOf(low).length();
        for(int i=lowLength; i<=9; i++){
            for(int j=0; j<= 10-i-1; j++){
                String numberString = totalDigits.substring(j, j+i);
                int number = Integer.parseInt(numberString);
                if(low <= number && number <= high){
                    result.add(number);
                }
            }
        }
        return result;
    }
}
