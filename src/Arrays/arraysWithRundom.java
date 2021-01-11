package Arrays;

import java.util.Random;
import java.util.Scanner;

class arraysWithRandom {
    // Initialize values
    public static int row;
    public static int colomn;
    public static int y;
    public static int x = 0;
    public static int value = 0;
    public static int[][] array = new int[10][10];

    public static void main(String[] args) {
        createRevertedArray();
        showArray();
        maxArrayValue();


    }

    public static void createArray() {

        //create instance of class Scanner
        Scanner scanner = new Scanner(System.in);

        //Enter value by keyboard
        System.out.print("Enter number of rows of array (max - 10): ");
        row = scanner.nextInt();
        System.out.print("Enter numbers of colons of array (max - 10): ");
        colomn = scanner.nextInt();

        // create instance of class Random
        Random random = new Random();

        //Adding values for array stared from 1

        for (y = 0; y < row; y++) {
            for (x = 0; x < colomn; x++) {
                array[y][x] = value;
                value++;
            }
        }
    }

    public static void createRandomArray() {

        //create instance of class Scanner
        Scanner scanner = new Scanner(System.in);

        //Enter value by keyboard
        System.out.print("Enter number of rows of array (max - 10): ");
        row = scanner.nextInt();
        System.out.print("Enter numbers of colons of array (max - 10): ");
        colomn = scanner.nextInt();

        // create instance of class Random
        Random random = new Random();

        //Adding values for array by random function

        for (y = 0; y < row; y++) {
            for (x = 0; x < colomn; x++) {
                array[y][x] = random.nextInt(100);
            }
        }
    }

    public static void createRevertedArray() {

        //create instance of class Scanner
        Scanner scanner = new Scanner(System.in);

        //Enter value by keyboard
        System.out.print("Enter number of rows of array (max - 10): ");
        row = scanner.nextInt();
        System.out.print("Enter numbers of colons of array (max - 10): ");
        colomn = scanner.nextInt();

        //Adding values for array started from 1

        for (y = array.length-1; y >=0; y--) {
            for (x = array.length - 1; x >= 0; x--) {
                //array[y][x] = random.nextInt(100);
                array[y][x] = value;
                value++;
            }
        }
    }

    public static void showArray() {
        //Show array in console
        System.out.println("Entered array is: ");
        for (y = 0; y < row; y++) {
            for (x = 0; x < colomn; x++) {
                System.out.print(array[y][x] + "\t");
            }
            System.out.println();
        }
    }

    public static void maxArrayValue() {
        int maxValue = 0;

        for (y = 0; y < row; y++) {
            for (x = 0; x < colomn; x++) {
                if (maxValue < array[y][x]) {
                    maxValue = array[y][x];
                }
            }
        }
        System.out.println("Max array value is: " + maxValue);
    }
}
