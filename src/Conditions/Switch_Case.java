package Conditions;

import java.util.Random;

import Loops.forLoop;
import OOP.Reference.*;

public class Switch_Case {


    public static void main(String[] args) {

        // How to generate random values

        Random random = new Random();
        int maxRandomValue = 6;
        int randomDay = random.nextInt(maxRandomValue);

        System.out.println(randomDay);

        //Switch/case usage

        switch (randomDay) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thisday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Suturday");
                break;
        }

        //New type of switch/case usage
//        switch (randomDay) {
//            case 0 -> System.out.println("Sunday");
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//        }

    }

}
