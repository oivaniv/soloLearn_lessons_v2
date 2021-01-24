package Exceptions_List_Threads_Files.WorkWithFiles;

import java.io.File;

public class FilesClass {
    public static void main(String[] args) {

        //Here we initialize variable "file" of class "File" and assign to it constructor "File" with parameter (file path)
        File file = new File("C:\\Users\\oivaniv\\Documents\\TestFile1.txt");

        //We can verify is there is a file in this path by .exist() method
        if (file.exists()){
            //We can show file name by .getName() method
            System.out.println(file.getName() + " exist");
        } else {
            System.out.println(file.getName() +" doesn't exist");
        }


    }
}
