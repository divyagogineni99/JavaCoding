package JavaConcepts.CSOutreach;

public class Stringarray {
    public static void main(String[] args){
        // Declaration
        String[] names;

        // Declaration and initialization
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        // Declaration with size, then initialization
        String[] days = new String[3];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";


        // Using for-each loop to print array elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        //     *************** 2d string array *************** //

        String[][] stringArray = {
                {"Apple", "Banana", "Cherry"},
                {"Date", "Elderberry", "Fig"},
                {"Grape", "Honeydew", "Kiwi"}
        };

        System.out.println("String 2D Array:");

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                System.out.print(stringArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
