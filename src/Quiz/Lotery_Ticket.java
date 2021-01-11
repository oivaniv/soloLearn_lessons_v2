package Quiz;

import java.util.Scanner;

public class Lotery_Ticket {
    public static void main(String[] args) {

        // How to  use scan functions

        Scanner read = new Scanner(System.in);
        int number = read.nextInt();

        System.out.println(number);

        //your code goes here
        int a = 10;
        int b = 9;
        int c = 4;
        int d = 6;

        System.out.println("number%a = " + number % a);
        System.out.println("number%b = " + number % b);
        System.out.println("number%c = " + number % c);
        System.out.println("number%d = " + number % d);

        if (number % a == 0 && number % b == 0) {
            System.out.println("You won $200");
        } else if (number % c == 0 || number % d == 0) {
            System.out.println("You won $50");
        } else {
            System.out.println("Try again");
        }
    }
}
