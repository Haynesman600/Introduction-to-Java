import java.io.*;

class Decoder {

    public static void main(String[] args) {
        try {
            processFile("Codes.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // This method takes a string "filePath", and processes it:
    private static void processFile(String filePath)
            throws IOException {
        // Open the file to read:
        BufferedReader file = getFileReader(filePath);
        // This variable will store our current line:
        String line;

        // Iterate over every line in a file:
        while ((line = file.readLine()) != null) {
            // Check if the line of the file is a Hamming code:
            boolean isHammingCode = testIfHammingCode(line);

            // Print out whether the input is a Hamming code:
            System.out.println(line + ": " + isHammingCode);
        }
    }

    // A method which takes a string "filePath", and returns a
    // buffered reader for that file:
    private static BufferedReader getFileReader(String filePath)
            throws IOException {
        return new BufferedReader(new FileReader(filePath));
    }

    // A methid which takes a string and returns whether the string
    // contains a Hamming code or not:
    private static boolean testIfHammingCode(String input) {
        return input.length() == 7 && input.matches("[0-1]+");
    }
}