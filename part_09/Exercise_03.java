package part_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
//be sure to close all connections

public class Exercise_03 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("/home/matthew/Documents/CodingNomads/labs/java_labs_bali/part_09/thefoxandthegrapes.txt"));

        // Demonstrating read()
        String bookTextRead = "";
        int c;
        try {
            while ((c = input.read()) != -1) {
                bookTextRead += (char) c;
            }
        }
        finally {
            input.close();
        }


        // Demonstrating readLine()
        input = new BufferedReader(new FileReader("/home/matthew/Documents/CodingNomads/labs/java_labs_bali/part_09/thefoxandthegrapes.txt"));
        String line;
        String bookTextReadLine = "";
        try {
            while ((line = input.readLine()) != null) {
                // Need to add line break otherwise each new line will simply be appended to the end of the previous one.
                bookTextReadLine += line + "\n";
            }
        }
        finally {
            if (input != null) {
                input.close();
            }
        }

        System.out.println(bookTextRead);
        System.out.println(bookTextReadLine);
    }
}