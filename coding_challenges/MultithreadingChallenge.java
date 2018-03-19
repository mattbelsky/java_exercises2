package coding_challenges;

/*
    Write a multithreaded application that will do the following:
    - Use four threads to read four individual files (ie, file1, file2, file3, file4) - each thread is responsible for
        reading one file.
    - Write the contents of all four files, in sequential order (1 -> 2 -> 3 -> 4) into file5.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class MyThread implements Runnable {
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

class MultithreadingChallenge {
    public static void main(String[] args) {
        try {
            /*  Couple questions:
                1)  Is there a way to execute this code block via a for loop?
                    I can create a string with the Runnable object names (part1, etc.) but I do not know how to convert
                    that to compilable code.
                2)  Is it ok to give the thread object t a default modifier so I can access it here or is there a way
                    to call join() if it's private?
             */
            MyThread part1 = new MyThread("theraven1.txt");
            part1.t.join();
            MyThread part2 = new MyThread("theraven2.txt");
            part2.t.join();
            MyThread part3 = new MyThread("theraven3.txt");
            part3.t.join();
            MyThread part4 = new MyThread("theraven4.txt");
        }
        catch (InterruptedException e) {
            // Do nothing.
        }
    }
}
