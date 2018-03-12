package part_09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CodingChallenge8 {
    public static void main(String[] args) throws IOException {
        int value = 0;

        try (
                FileReader in = new FileReader(
                        "/home/matthew/Documents/CodingNomads/labs/java_labs_bali/part_09/thefoxandthegrapes.txt");
                FileWriter out = new FileWriter(
                        "/home/matthew/Documents/CodingNomads/labs/java_labs_bali/part_09/encrypted.txt")
        ) {
            while ((value = in.read()) != -1) {
                if (value == ' ') {
                    value = '-';
                }
                out.write(value);
            }
        }
    }
}
