package coding_challenges;

/*
    Write a multithreaded application that will do the following:
    - Use four threads to read four individual files (ie, file1, file2, file3, file4) - each thread is responsible for
        reading one file.
    - Write the contents of all four files, in sequential order (1 -> 2 -> 3 -> 4) into file5.
 */

import java.util.ArrayList;

public class MultithreadingChallenge {
    public static void main(String[] args) {
        try {
            ArrayList<MyThread> threads = new ArrayList();

            for (int i = 1; i <= 4; i++) {
                MyThread t = new MyThread("theraven" + i + ".txt");
                threads.add(t);
                threads.get(i - 1).t.join();
            }
        }
        catch (InterruptedException e) {
            // Do nothing.
        }
    }
}
