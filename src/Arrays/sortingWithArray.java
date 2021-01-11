package Arrays;

import java.util.Random;
import java.util.Scanner;

public class sortingWithArray {
    public static void main(String[] args){

        // Initialize values
        int elements,x,y,n;
        int[] array = new int[100];

        //create instance of class Scanner
        Scanner scanner = new Scanner(System.in);

        //Enter value by keyboard
        System.out.print("Enter number of elements of array (max - 10): ");
        elements = scanner.nextInt();


        // create instance of class Random
        Random random = new Random();

        //Adding values for array by random function

        for (x=0;x<elements;x++){
            array[x] =random.nextInt(100);
        }


        //Show array in console
        System.out.println("Array is: ");

        for (x=0;x<elements;x++){
            System.out.print(array[x] + "\t");
        }
        System.out.println();

        n=array.length;

        for (x=0;x<elements-1;x++){
            for (y=0;y<elements-x-1;y++){
                if (array[y]>array[y+1]){
                    int temp = array[y];
                    array [y] =array[y+1];
                    array [y+1]=temp;
                }
            }

        }
        //Show array in console
        System.out.println("After Sorting array is: ");

        for (x=0;x<elements;x++){
            System.out.print(array[x] + "\t");
        }
    }
}
