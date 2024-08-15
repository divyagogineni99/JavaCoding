package JavaConcepts.ExceptionHandling;

public class ThrowThrows {

    //IF YOU ARE DOING UCHECKED EXCPETION, THE CALLER  NEED NOT  HANDLE THAT EXCEPTION
    public void readFilewithUNCheckedException(String filePath) throws RuntimeException {

        if (filePath == null) {
            // it will not give any error if you throw or not
            //throw new RuntimeException("File path cannot be null");
        }
        // Code to read the file
    }

    public static void main(String[] args) {
        ThrowThrows example = new ThrowThrows();
        example.readFilewithUNCheckedException(null); // This will throw the IOException

    }


//*************************************************************************************************************************
    // IF YOU ARE DOING UNCHECKED EXCPETION, THE CALLER MUST NEED TO HANDLE THAT EXCEPTION

//    public void readFilewithCheckedException(String filePath) throws IOException {
//        if (filePath == null) {
//            throw new IOException("File path cannot be null");
//        }
//        // Code to read the file
//    }
//
//        public static void main(String[] args) {
//            ThrowThrows example = new ThrowThrows();
//            //caller handling the exception
//            try {
//                example.readFilewithCheckedException(null); // This will throw the IOException
//            } catch (IOException e) {
//                System.out.println("Caught exception: " + e.getMessage());
//            }
//        }
}
