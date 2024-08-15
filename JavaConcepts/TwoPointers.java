package JavaConcepts;

import java.util.*;

// Given an array of source,destination pairs, find and return the route for a given source and destination.
// eg: 1,2,4,5,2,3 source: 1 dest: 3 ans: 1 -> 2 -> 3
public class TwoPointers {
    static final int r = 5;
    static final int c = 5;
    static int k = 0;
    static int count = 0;

    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "(" + first +
                    ", " + second + ")";
        }
    }

    public static void main(String[] args) {
//        int mat[][] = {
//                {1, 1, 1, 0, 0},
//                {1, 0, 1, 1, 1},
//                {0, 0, 0, 1, 0},
//                {0, 1, 0, 1, 0},
//                {1, 0, 0, 1, 1}
//        };
//        int mat[][] = {
//                {1, 1, 1},
//                {0, 1, 1},
//                {1, 1, 1},
//        };
        int mat[][] = {
                {1, 1,1},

        };
        // Given a matrix, Find if there's a path from (0,0) to (m,n)
        // Given a matrix, Return the path if there's a path from (0,0) to (m,n) else "No path"
        System.out.println(findIfPath(mat));
    }

    public static Stack<Pair> findIfPath(int[][] mat) {
        //boolean visited[][] = new boolean[mat.length][mat[0].length];
        int i = 0;
        int j = 0;
        Stack<Pair> s = new Stack();
        boolean result = findIfPathDFS(mat, i, j, s);
        if (result == true) {

            return s;
        } else {
            System.out.println("NO PATH");
            return s;
        }
    }

    private static boolean findIfPathDFS(int[][] mat, int i, int j, Stack<Pair> s) {
        if (isOverFlow(mat, i, j)) {
            return false;
        }
        if (mat[i][j] != 1 || mat[i][j] == -1) {
            return false;
        }
        s.push(new Pair(i, j));
        mat[i][j] = -1;
        if ((i == mat.length -1  && j == i)|| (i == mat.length && j<=i) || (j==mat[0].length && i<=j )) {
            System.out.println("There is a path");
            return true;
        }
        //System.out.println("Parent :" + i +"," +j);
        if (    findIfPathDFS(mat,i, j + 1, s) ||
                findIfPathDFS(mat,i, j - 1, s) ||
                findIfPathDFS(mat, i + 1, j, s) ||
                findIfPathDFS(mat, i - 1, j, s)     ) {
            //mat[i][j] = -1;
            return true;
        }else{
            s.pop();
        }
        s.pop();
        return false;
    }


    static boolean isOverFlow(int mat[][], int i, int j) {
        return (i < 0) || (i >= mat.length) || (j < 0) || (j >= mat.length);
    }

    static void rec(List<Integer> list) {
        if (list.size() == 2) {
            return;
        }
        list.add(1);
        rec(list);
        if (list.size() % 2 == 0) {
            list.add(list.size());
        } else {
            list.add(Integer.MIN_VALUE);
        }
    }

    private static int countIslands(int[][] mat) {
        boolean visited[][] = new boolean[mat.length][mat[0].length];
        int i = 0;
        int j = 0;
        Queue<Pair> q = new LinkedList<>();
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (mat[i][j] == 1 && !visited[i][j]) {
                    q.add(new Pair(i, j));
                    BFS(mat, visited, q);
                    visited[i][j] = true;
                    System.out.println("After each island (" + i + "," + j + ")");
                    print(visited);
                    count++;
                }
            }
        }
        return count;
    }

    //public static void BFS(int[][] mat, boolean visited[][], Queue<pair> q, int si, int sj){
    public static void BFS(int[][] mat, boolean visited[][], Queue<Pair> q) {
        int row[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int col[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        if (q.peek() == null) {
            return;
        }
        int i = q.peek().first;
        int j = q.peek().second;
        q.remove();
        for (int k = 0; k < 8; k++) {
            if (isSafe(mat, i + row[k], j + col[k], visited)) {
                q.add(new Pair(i + row[k], j + col[k]));
                visited[i + row[k]][j + col[k]] = true;
            }
        }
        BFS(mat, visited, q);

    }

    static boolean isSafe(int mat[][], int i, int j,
                          boolean visited[][]) {
        return (i >= 0) && (i < r) && (j >= 0) && (j < c) &&
                (mat[i][j] == 1 && !visited[i][j]);
    }


    private static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                break;
            }
            System.out.print(result[i] + " ");
        }
        //System.out.println("\n");
    }

    private static void print(boolean[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static String isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        if (n == 1) {
            return "Happy Number";
        } else {
            return "Not a Happy Number";
        }
    }

    public static String isHappyLL(int n) {
        int slowRunner = n;
        int fastRunner = getNext(n);
        while (fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
        }
        if (fastRunner == 1) {
            return "Happy Number";
        } else {
            return "Not a Happy Number";
        }
    }

    public static void interestingNumber(int number) {
        int squareAndAdd = 0;
        int i = 0, j = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        while (number != 0) {
            while (number != 0) {
                int a = (number % 10);
                squareAndAdd = squareAndAdd + a * a;
                number = number / 10;
            }
            if (set.contains(squareAndAdd)) {
                System.out.println("Not Happy Number");
                break;
            } else {
                set.add(squareAndAdd);
            }
            if (squareAndAdd == 1) {
                System.out.println("Happy Number");
                break;
            }
            number = squareAndAdd;
            squareAndAdd = 0;
        }
    }

    public static int[] coOrdinates(int[] array, int source, int destination) {
        HashMap<Integer, Integer> coOrd = new HashMap<Integer, Integer>();
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (i % 2 == 0) {
                coOrd.put(array[i], array[i + 1]);
            }
        }
        for (int i : coOrd.keySet()) {
            System.out.println("key: " + i + " value: " + coOrd.get(i));
        }
        int s = coOrd.size();
        int[] arr = new int[s + 1];
        int arrPosition = 0;
        int y1 = coOrd.get(source);
        arr[arrPosition] = source;
        while (s > 0) {
            if (y1 == destination) {
                arr[arrPosition + 1] = destination;
                return arr;
            } else {
                if (coOrd.containsKey(y1)) {
                    arrPosition++;
                    arr[arrPosition] = y1;
                    y1 = coOrd.get(y1);
                }
            }
            s--;
        }
        return null;
    }


    public static int removeDuplicates(int[] nums) {
        int arrayLength = nums.length;
        int newNums[] = new int[arrayLength];
        int k = 1, temp = 0, j = 0;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                newNums[j] = nums[i];
                j++;
            }
            newNums[j] = nums[arrayLength - 1];
        }
        for (int i = 0; i < j + 1; i++) {
            nums[i] = newNums[i];
        }
        return j + 1;
    }

    public static int removeDuplicates1(int[] nums) {
        int arrayLength = nums.length;
        int k = 0, temp = 0;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (nums[i] == nums[i + 1] || nums[i] == nums[i - 1]) {
                temp = nums[i];
                for (int j = i; j < arrayLength - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[arrayLength - 1] = temp;
            } else {
                k++;
            }
        }

        return k + 1;
    }


    // Given an array, rotate it k times and return the new rotated array
    // Eg: 1,2,4,6,7 k = 2 result = 6,7,1,2,4
    public static void rotateKtimes(long[] array, int k) {
        int arrayLength = array.length;
        int i = 0, j = 0;
        long temp = 0;
        if (arrayLength == 0) {
            System.out.println("No Elements");
        } else if (arrayLength == 1 && k == 1) {
            System.out.println(array[0]);
        } else if (k == 0) {
            System.out.println("no need to rotate");
        } else {
            for (i = 0; i < k; i++) {
                temp = array[0];
                for (j = 0; j < arrayLength; j++) {
                    if (j == arrayLength - 1) {
                        break;
                    }
                    array[j] = array[j + 1];
                }
                array[arrayLength - 1] = temp;

            }
        }
        for (i = 0; i < arrayLength; i++) {
            System.out.println(array[i]);

        }

    }

    // Given an unsorted array. remove duplicates
    // Eg: 5,7,1,2,3,3,5,5,6 =>
    private static long[] removeDuplicatesUnsorted(long[] array) {
        HashSet<Long> set = new HashSet<Long>();
        long arrDup[] = new long[5];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                arrDup[k] = array[i];
                k++;
            } else {
                set.add(array[i]);
            }
        }
        for (int i = 0; i < arrDup.length; i++) {
            System.out.println("Dup element:" + arrDup[i]);
        }
        long arr[] = new long[set.size()];
        int j = 0;
        for (long i : set) {
            arr[j++] = i;
        }
        return arr;
    }


    // Given an sorted array. remove duplicates
    // Eg: 1,2,3,3,5,5,6 => 1,2,3,5,6
    private static void removeDuplicatesSorted(long[] array) {
        int arrayLength = array.length;
        long[] newArray = new long[arrayLength];
        int i = 0, j = 0;
        //int newArrayLength=newArray.length;
        if (arrayLength == 0) {
            System.out.println("No Elements");
        } else if (arrayLength == 1) {
            System.out.println(array[0]);
        } else {
            for (i = 0; i < arrayLength - 1; i++) {
                if (array[i] != array[i + 1]) {
                    if (j <= arrayLength) {
                        newArray[j] = array[i];
                    }
                    j++;
                }
            }
            newArray[j] = array[arrayLength - 1];
            //int newArrayLength = newArray.length;
            for (i = 0; i <= j; i++) {
                System.out.println(newArray[i]);

            }

        }
    }

    public static void targetSum(int[] array, int target) {
        int targetFound = 0;
        //Scanner target = new Scanner();
        int arrayLength = array.length;
        if (arrayLength == 0) {
            System.out.println("No Elements");
        } else if (arrayLength == 1) {
            if (array[0] == target) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            for (int i = 0; i < arrayLength; i++) {
                for (int j = i + 1; j < arrayLength; j++) {
                    if (array[i] + array[j] == target) {
                        targetFound = 1;
                    }
                }
            }
            if (targetFound == 1) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

        }
    }

}
