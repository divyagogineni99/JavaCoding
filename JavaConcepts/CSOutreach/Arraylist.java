package JavaConcepts.CSOutreach;

import java.util.*;

//An ArrayList class is a resizable array, which is present in the java. util package.
    //While built-in arrays have a fixed size, ArrayLists can change their size dynamically.
    //Elements can be added and removed from an ArrayList whenever there is a need, helping the user with memory management.
public class Arraylist {
        public static void main(String[] args) {
            // Declaration and initialization
            // ArrayList<DataType> arrayListName = new ArrayList<>();
            // List<DataType> arrayListName = new ArrayList<>();
            ArrayList<String> fruits = new ArrayList<>();

            // Adding elements
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");
            System.out.println("Initial list: " + fruits);

            // Adding at specific index
            fruits.add(1, "Blueberry");
            System.out.println("After adding at index 1: " + fruits);

            // Adding all elements from another collection
            ArrayList<String> moreFruits = new ArrayList<>();
            moreFruits.add("Date");
            moreFruits.add("Raspberry");
            fruits.addAll(moreFruits);
            System.out.println("After adding more fruits: " + fruits);

            // Size and capacity
            System.out.println("Size of list: " + fruits.size());
            System.out.println("Is list empty? " + fruits.isEmpty());

            // Accessing elements
            System.out.println("Element at index 2: " + fruits.get(2));
            fruits.set(2, "Coconut");
            System.out.println("After replacing element at index 2: " + fruits);

            // Removing elements
            fruits.remove("Date");
            fruits.remove(0);
            System.out.println("After removals: " + fruits);

            // Searching
            System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));
            System.out.println("Index of 'Coconut': " + fruits.indexOf("Coconut"));

            // Sublist
            List<String> subList = fruits.subList(1, 4);
            System.out.println("Sublist from index 1 to 3: " + subList);

            // Conversion to array
            String[] fruitArray = fruits.toArray(new String[0]); // [Blueberry, Coconut, Cherry, Raspberry]
            System.out.println("First element of array: " + fruitArray[0]);

            // Iterating
            System.out.println("Iterating using for-each loop:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            System.out.println("Iterating using Iterator:");
            Iterator<String> iterator = fruits.iterator(); // [Blueberry, Coconut, Cherry, Raspberry]
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            // Sorting
            Collections.sort(fruits);
            System.out.println("After sorting: " + fruits);

            // Other utility methods
            fruits.replaceAll(String::toUpperCase);
            System.out.println("After converting to uppercase: " + fruits);

            fruits.removeIf(fruit -> fruit.startsWith("B"));
            System.out.println("After removing fruits starting with 'B': " + fruits);

            // Clear the list
            fruits.clear();
            System.out.println("After clearing: " + fruits);

            // Demonstrate initial capacity
            ArrayList<Integer> numbers = new ArrayList<>(20);
            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }
            System.out.println("Numbers: " + numbers);

            // Trim to size
            numbers.trimToSize();
            System.out.println("After trimming to size: " + numbers);
        }

//            declare one arrayList
//            use while loop
//                    keep reading(scanner) the integer values, and add them to arrayList,
//                    if input is '-1' you need  to stop reading
//                    and print the arrayList.
            public static void NumberStorage(){
                ArrayList<Integer> numbers = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter numbers (enter -1 to stop):");
                int input;
                while ((input = scanner.nextInt()) != -1) {
                    numbers.add(input);
                }

                System.out.println("Numbers entered:" +numbers);
//                for (int number : numbers) {
//                    System.out.println(number);
//                }
            }


//    declare 2 arrayLists
//    and merge them and print the merged arryList

// declare one arrayList, and you need to the reverse the arrayList, print the reveresed arrayList
    public static void reverseArrayList() {
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(2);
        intArray.add(3);
        intArray.add(3);

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = intArray.size() - 1; i >= 0; i--) {
            reversedList.add(intArray.get(i));
        }
        System.out.println( reversedList);
    }

    //Remove duplicates from arrayList


}
