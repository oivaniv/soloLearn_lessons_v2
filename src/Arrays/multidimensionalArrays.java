package Arrays;

import java.util.Scanner;

public class multidimensionalArrays {

    public static void main (String[] args) {

        int row, colomn, y, x;
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows of array (max - 10): ");
        row = scanner.nextInt();
        System.out.print("Enter numbers of colons of array (max - 10): ");
        colomn=scanner.nextInt();

        System.out.print("Enter "+ row*colomn + " elements of array:");
        for (y=0;y<row;y++){
            for (x=0;x<colomn;x++){
                array[y][x] =scanner.nextInt();
            }
        }

        System.out.println("Entered array is: ");
        for(y=0;y<row;y++){
            for (x=0;x<colomn;x++){
                System.out.print(array[y][x] + "\t");
            }
            System.out.println();
        }


    }
}
