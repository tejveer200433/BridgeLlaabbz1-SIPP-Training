package tcandalgo;

import java.io.*;

public class FileReadingPerformance {

    public static void readFileUsingFileReader(String filename) throws IOException {
        try (FileReader fr = new FileReader(filename)) {
            while (fr.read() != -1) {
                // Read character by character
            }
        }
    }

    public static void readFileUsingInputStreamReader(String filename) throws IOException {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filename))) {
            while (isr.read() != -1) {
                // Read character by character
            }
        }
    }

    public static void main(String[] args) {
        String filename = "testfile.txt"; // Ensure this file exists and has content

        long[] fileSizesMB = {1, 100}; // Removed 500MB for quicker testing; uncomment if needed
        long startTime, endTime;

        for (long sizeMB : fileSizesMB) {
            // NOTE: You must manually ensure 'testfile.txt' has the correct size
            // for accurate measurement. The code below assumes 'testfile.txt'
            // is generated to simulate the 'sizeMB'.
            // For real testing, you'd generate the file before running this loop.

            System.out.println("File Size: " + sizeMB + "MB (Please ensure 'testfile.txt' is this size)");

            try {
                // FileReader
                startTime = System.nanoTime();
                readFileUsingFileReader(filename);
                endTime = System.nanoTime();
                System.out.println("FileReader Time: " + (endTime - startTime) / 1_000_000 + "ms");

                // InputStreamReader
                startTime = System.nanoTime();
                readFileUsingInputStreamReader(filename);
                endTime = System.nanoTime();
                System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1_000_000 + "ms");
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
                System.err.println("Please create a 'testfile.txt' in the same directory.");
            }
            System.out.println("--------------------");
        }
    }
}
