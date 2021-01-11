package Quiz;

import java.util.Scanner;


public class LoanCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextInt();
        //your code goes here

        for (int x = 1; x <= 6; x++) {
            //Use Math.ceil to receive 1 instead 0.2, so we make our value bigger
            amount = amount - (Math.ceil(amount / 10));
            System.out.println("Month amount is :" + Math.ceil(amount/10));
            System.out.println("The " + x + " month amount is: " + amount);
        }

        //(int) used to convert to int
        System.out.println("The final amount after 6 months is: " + (int)amount);
    }
}

