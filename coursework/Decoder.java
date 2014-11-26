import java.io.*;

class Decoder {

    public static void main(String[] args) {
        try {
            // File reader connects to file, named file reader readF:
            FileReader readF = new FileReader("Codes.txt");
            // Provide buffering for the reader readF. Ok so this is
            // the code to read a text file line by line:
            BufferedReader buffF = new BufferedReader(readF);
            String line;

            // Reading file till the end:
            while ((line = buffF.readLine()) != null) {

                // Pass "line" to checkInput() and store result in "Test":
                boolean Test= checkInput(line);

                // Print out result of checkInput():
                System.out.println(line + ": " + Test);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // The method to decide to read line or not:
    public static boolean checkInput(String input) {
        // So this is a method that accepts an argument in this case
        // the line read from the text files and checks whether the
        // line read from file is 7 chars long and only contains 1 and
        // 0s. So i need to somehoe pass Sting "line" to method
        // "checkInput":
        if (input.length() == 7 && input.matches("[0-1]+")) {
            return true;
        } else {
            return false;
        }
    }
}
