package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Exercise_02 {
    public static void main(String[] args) throws IOException {
        // Do I need to close both, or if I declare the FIS inside the BIS initialization statement, will it close
        // automatically when I close BIS?
        FileInputStream fis = new FileInputStream("/home/matthew/Documents/CodingNomads/labs/java_labs_bali/part_9/thefoxandthegrapes.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int i = 0;

        try {
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
        }
        finally {
            if (bis != null && fis != null) {
                bis.close();
                fis.close();
            }
        }
    }
}
