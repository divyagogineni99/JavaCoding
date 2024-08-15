package JavaConcepts.CSOutreach;

public class Chararray {

    public static void main(String args[]) {
        // Declaration
        char[] letters;

        // Declaration and initialization
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // Declaration with size, then initialization
        char[] greeting = new char[5];
        greeting[0] = 'H';
        greeting[1] = 'e';
        greeting[2] = 'l';
        greeting[3] = 'l';
        greeting[4] = 'o';


// Converting char array to string and printing
        System.out.println(new String(greeting)); // Hello



        //    ******************  2d char array  *******************     //


        char[][] charArray = new char[3][3]; // Declaring and initializing with size

        // Initializing each character separately
        charArray[0][0] = 'a';
        charArray[0][1] = 'b';
        charArray[0][2] = 'c';
        charArray[1][0] = 'd';
        charArray[1][1] = 'e';
        charArray[1][2] = 'f';
        charArray[2][0] = 'g';
        charArray[2][1] = 'h';
        charArray[2][2] = 'i';

        System.out.println("Character 2D Array:");

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                System.out.print(charArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
