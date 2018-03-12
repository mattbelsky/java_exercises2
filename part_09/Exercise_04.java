package part_09;


//Bonus questions not covered in book.

//Write a class that can get the date of the last modification, can check whether or not you can write to that file
//and can set a file to read-only.
//Hint, use the "File" class.

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise_04 {
    public static void main(String[] args) {
        File foxGrapes = new File("/home/matthew/Documents/CodingNomads/labs/java_labs_bali/part_09/thefoxandthegrapes.txt");
        Date dateModified = new Date (foxGrapes.lastModified());
        foxGrapes.canWrite();
        foxGrapes.setReadOnly();
    }
}








