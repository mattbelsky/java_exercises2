package coding_challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyThread implements Runnable {
    private String inputFileName;
    private String text;
    Thread t;

    public MyThread(String inputFileName) {
        this.inputFileName = inputFileName;
        text = new String();
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        String path = "/home/matthew/Documents/CodingNomads/labs/java_labs_bali/coding_challenges/";
        String outputFileName = "theraven.txt";

        text = read(path + inputFileName);
        write(text,path + outputFileName);
    }

    public synchronized String read(String path) {
        String text = new String();
        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                text += "\n" + currentLine;
            }
        }
        catch (IOException e) {
            // Do nothing.
        }
        return text;
    }

    public synchronized void write(String text, String path) {
        try (FileWriter fw = new FileWriter(path, true)) { // append = true appends the content at the end of the file
            fw.write(text);
        }
        catch (IOException e) {
            // Do nothing.
        }
    }
}