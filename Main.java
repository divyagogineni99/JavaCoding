public class Main {
    static int a = 4, b = 1, c = 2;
    public static void main(String[] args) {
        //int[] array = {1,2,-3,-4};
        //int[] array = {9, 5, 1, 4, 3};
        //sort(array);
        //insertionSort(array);
        //print(array);
        //TwoPointers.targetSum();
        //printMethod();
        increment();
    }

    public static void printMethod(){

    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        // 9, 8, 7, 6, 5
        for (int itr = 0; itr < array.length - 1; itr++) {
            int temp = array[itr + 1];
            int tempPossiblePos = itr + 1;
            for (tempPossiblePos = itr + 1; tempPossiblePos > 0;) {
                if(temp < array[tempPossiblePos-1]) {
                    array[tempPossiblePos] = array[tempPossiblePos-1]; // 9,9,1,4,3 // 5,5,9,4,3 // 5,9 => 5,5,9 (j=0) 9,9
                    tempPossiblePos--; //j = 0
                } else
                    break;
            }
            if(tempPossiblePos < itr + 1) {
                if(tempPossiblePos == 0) {
                    array[0] = temp;
                } else
                    array[tempPossiblePos] = temp;
            }
            // if tempPossiblePos == 0 then breaks;
        }
    }

    void insertionSort_copied(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }

    public static void sectionSort(int[] array) {
        int n = array.length;
        // 9, 8, 7, 6, 5
        for (int itr = 0; itr < n - 1; itr++) {
            int min_index = itr + 1;
            for (int j = min_index; j < n - 1; j++) {
                if (array[min_index] >= array[j + 1]) {
                    min_index = j + 1;
                }
            }
            System.out.println(min_index);
            int i = 0;
            if (array[itr] > array[min_index]) {
                int temp1 = array[min_index];
                array[min_index] = array[itr];
                array[itr] = temp1;

            }

            print(array);

        }
        System.out.print("\n");

    }


    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int itr = 0; itr < n - 1; itr++) {
            for (int index = 0; index < n - itr - 1; index++) {
                if (array[index] >= array[index + 1])
                    continue;
                int temp = array[index + 1];
                array[index + 1] = array[index];
                array[index] = temp;
            }
        }
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void pattern4() {
        int n = 7;
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - 1;
            while (row <= noOfSpaces) {
                System.out.print("\t");
                noOfSpaces--;
            }
            for (int j = 1; j <= (2 * row - 1); j++) {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }

    public static void pattern5() {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - 1;
            if (row <= n / 2 + 1) {
                for (int j = 1; j <= 2 * row - 1; j++) {
                    System.out.print("*\t");
                }
                System.out.print("\n");
            } else if (row > n / 2 + 1 && row != n) {
                for (int j = row; j <= row + 2; j++) {
                    System.out.print("*\t");
                }
                System.out.print("\n");
            }
            if (row == n) {
                System.out.print("*\t");
            }
        }
    }


    public static void pattern3() {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            int noOfSpaces = n - 1;
            while (row <= noOfSpaces) {
                System.out.print("\t");
                noOfSpaces--;
            }
            for (int j = 1; j <= (2 * row - 1); j++) {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }

    public static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* \t");
            }
            System.out.print("\n");
        }
    }

    public static void pattern() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" \t");
            }
            for (int k = i; k <= 7; k++) {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }

    public static void pattern1() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j < i) {
                    System.out.print(" \t");
                } else {
                    System.out.print("* \t");
                }
            }
            System.out.print("\n");
        }
    }


    public static void reverseNumber() {
        int input = 345;
        int reverseNumber = 0;
        int n, m;
        while (input != 0) {
            n = input % 10;
            input = input / 10;
            reverseNumber = reverseNumber * 10 + n;
        }
        System.out.println(reverseNumber);
    }


    public static void binaryConvertor() {
        int input = 13;
        int output;
        for (int i = input; i >= 1; i = i / 2) {
            output = i % 2;
            System.out.println(output);
        }
    }

    public static void increment() {
        int a = 1;
        int b = 2;
        int c = 3;
        if (++a > b++ || a-- > 0)
            c++;
        else
            c--;
        System.out.println(a + " " + b + " " + c);
    }

    private static void m5() {
        for (int j = 0; j < 10; j = j * 2) {
            for (int i = 0; i < 20; i = i + 2) {
                System.out.println("i" + i);
                if (i / 15 == 1)
                    break;
            }
            System.out.println("j" + j);
        }
    }// i 0 i 2 i 4 i 6 i 8 i 10 i 12 i 14 i 16 j 0
    // if j=1;
    // i 0 i 2 i 4 i 6 i 8 i 10 i 12 i 14 i 16 j 1
    // i 0 i 2 i 4 i 6 i 8 i 10 i 12 i 14 i 16 j 2
    // i 0 i 2 i 4 i 6 i 8 i 10 i 12 i 14 i 16 j 4
    // i 0 i 2 i 4 i 6 i 8 i 10 i 12 i 14 i 16 j 8

    private static void m6() {
        for (int j = 1; j < 10; j = j * 2) {
            for (int i = 0; i < 20; i = i + 2) {
                System.out.println("i" + i);
                if (i % 15 == 0)
                    break;
            }
            System.out.println("j" + j);
            if (j == 2)
                return;
        }
        System.out.println("m6");
    }// i 0  j 0
    // i 0 j 0
    // if j=1;
    // i 0 j 1
    // i 0 j 2

    private static void m7() {
        for (int j = 0; j < 10; j = j * 2) {
            for (int i = 0; i < 20; i = i + 2) {
                System.out.println("i" + i);
                if (i % 15 == 0)
                    break;
            }
            System.out.println("j" + j);
            if (j == 2)
                break;
        }
        System.out.println("m7");
    }

    private static void m8() {
        for (int j = 0; j < 10; j = j * 2) {
            for (int i = 0; i < 20; i = i + 2) {
                System.out.println("i" + i);
                if (i % 15 == 0)
                    break;
            }
            System.out.println("j" + j);
            if (j == 2)
                return;
        }
        System.out.println("m6");
    }

    private static void scopeTest() {
        int i = 0;
        for (i = 0; i < 3; i++) {
            for (int j = 0; i < j; j++) {
                System.out.println("*");
            }
        }
        System.out.println("m6");
    } // m6


    private static void scopeTest2() {
        int j = 0;
        for (int i = 0; i < 3; i++) {
            for (; j < 3; j++) {
                System.out.println("l1");
            } //l1 l1 l1
            if (j == 6) {
                System.out.println("b");
                break;
            }
            for (; j < 5; j++) {
                System.out.println("l2");
            } // l2 l2
            if (i == 2 && j > 5) {
                System.out.println("r");
                return;
            }
        }
        System.out.println("m6");
    } // m6

    private static void m11() {
        int j = 0;
        for (; ; ) {
            System.out.println("m11");
        }
    }// infinity m11

    private static void m12() {
        for (int i = 0; i < 3; i++) ;
        System.out.println("m12");
    } // m12 m12 m12

    private static void m13() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; i + j < 6; j++) {
                System.out.println(i + j);
                // 0 1 2 3 4 5
                // 1 2 3 4 5
                // 2 3 4 5
                // 3 4 5
            }
        }
        System.out.println("m11");// m11
    }

    // while
    private static void m14() {
        int i = 0;
        while (++i < 3) {
            System.out.println(i);
        }// 1 2
    }

    // while
    private static void m15() {
        int i = 0;
        while (++i < 3) { //1<3
            for (int j = 0; j < i; j++) {
                System.out.println(j);// 0 //0 1
            }
            System.out.println(i);// 1 //2
        }
    } // 0 1 0 1 2

    private static void convertToWhileLoopAndVerifyOutput() {
//        for(int i = 2 ; i < 6 ; i++) {
//            if(i == 5) {
//                break;
//            }
//        }
        int i = 2;
        while (i < 6) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
            i++;
        }
    }
}