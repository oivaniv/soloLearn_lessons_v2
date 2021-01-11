package Quiz.BinaryConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Here we initialize "sc" object of Scanner class
        Scanner sc = new Scanner(System.in);
        //Here we initialize variable "x" and assign value returned from method nextInt();
        int x = sc.nextInt();

        //Here we show value which is returned from toBinary(x) method of Converter class
        System.out.print(Converter.toBinary(x));

    }
}
