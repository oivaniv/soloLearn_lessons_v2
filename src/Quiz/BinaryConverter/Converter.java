package Quiz.BinaryConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        //Here we initialize "sc" object of Scanner class
        Scanner sc = new Scanner(System.in);
        //Here we initialize variable "x" and assign value returned from method nextInt();
        int x = sc.nextInt();

        //Here we show value which is returned from toBinary(x) method
        System.out.println(toBinary(x));

    }

    public static String toBinary(int number) {
        //Initialize String variable binary and assign value ""
        String binary= "";

        //Initialize function while
        while (number>0){
            //Here we assign to variable value of Modulus (Returns the division remainder) + previous value of binary
            binary=(number%2)+binary;
            //Here we assign to variable value of previous value / 2
            number/=2;

        }
        //Here we return the final version of variable binary
        return binary;
    }

    public static String testBinary(int number){

        //System.out.println("Number is: " + number);

        String binary= "";

        while (number>0){
            binary=(number%2)+binary;
            number/=2;

        }
        return binary;

    }

    public static void testNewBinaryWithArrayList(int decimalValue){
        int binaryValue;

        ArrayList<Integer> binaryArray = new ArrayList<Integer>();

        while (decimalValue>0){
            binaryValue = (decimalValue%2);
            decimalValue=decimalValue/2;

            binaryArray.add(binaryValue);

        }
        System.out.print(Arrays.toString(binaryArray.toArray()));

    }

}
