package Exceptions_List_Threads_Files.WorkWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileClass {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\oivaniv\\Documents\\TestFile1.txt");

            Scanner sc = new Scanner(file);

            while (sc.hasNext()){
                System.out.print(sc.next() + " ");
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
