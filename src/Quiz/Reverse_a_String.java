package Quiz;

import java.util.Scanner;

public class Reverse_a_String {

    public static void main(String[] args) {
        //Here we initialize object of class Scanner
        Scanner scanner = new Scanner(System.in);
        //Here we initialize String variable "text" and assign value form method nextLine
        String text = scanner.nextLine();
        //Here we initialize array "arr" type char, and assign value of variable "text", also use method toCharArray()
        char[] arr = text.toCharArray();
        //Here we check array length
        System.out.println(arr.length);

        //Here we initialize for loop to have access to all elements of the array
        for (int x=0;x<arr.length;x++){
            //Here we use println to show all elements of array
            System.out.print(arr[x]);
            //Here we show all elements reverted. To show reverted elements we show last element instead the first. arr[length] can be used, cause it is bigger than last elements index
            // so we use arr[length - 1] and after that we do (-x), to shown next reverted elements
            System.out.print(arr[(arr.length-x-1)]);
        }




        //your code goes here
    }

    public void showElements(){
    }
}
