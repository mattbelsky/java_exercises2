package coding_challenges;

/*
    Write a multithreaded application that will do the following:
    - Use four threads to read four individual files (ie, file1, file2, file3, file4) - each thread is responsible for
        reading one file.
    - Write the contents of all four files, in sequential order (1 -> 2 -> 3 -> 4) into file5.
 */

public class MultithreadingChallenge {
    public static void main(String[] args) {
        try {
            /*  Couple questions:
                1)  Is there a way to execute this code block via a for loop?
                    I can create a string with the Runnable object names (part1, etc.) but I do not know how to convert
                    that to compilable code.
                2)  Is it ok to give the thread object t a default access modifier so I can access it here or is there
                    a way to call join() if it's private?
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
