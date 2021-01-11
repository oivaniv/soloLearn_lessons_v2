package Quiz;

import java.util.Scanner;

public class AllEqual {
    public static void main(String[] args) {

        //Equal();

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && a == c) {
            System.out.println("all equal");
        }
        else {
            System.out.println("not all equal");
        }

    }

    public static void Equal(){
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        char[] valueArr = value.toCharArray();

        int x =0;
        if (valueArr[x]==valueArr[x+1]&&valueArr[x]==valueArr[x+2]){

            System.out.println("Equal");

        }else {
            System.out.println("Not equal");
        }
    }

    public static void EqualЕTwo(){
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        char[] valueArr = value.toCharArray();

        int x =0;
        if (valueArr[x]==valueArr[x+1]&&valueArr[x]==valueArr[x+2]){

            System.out.println("Equal");

        }else {
            System.out.println("Not equal");
        }
    }

    public static void EqualTree(){
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        char[] valueArr = value.toCharArray();

        int x =0;
        if (valueArr[x]==valueArr[x+1]&&valueArr[x]==valueArr[x+2]){

            System.out.println("Equal");

        }else {
            System.out.println("Not equal");
        }
    }

    public static void EqualFive(){
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        char[] valueArr = value.toCharArray();

        int x =0;
        if (valueArr[x]==valueArr[x+1]&&valueArr[x]==valueArr[x+2]){

            System.out.println("Equal");

        }else {
            System.out.println("Not equal");
        }
    }

    public static void EqualFour(){
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        char[] valueArr = value.toCharArray();

        int x =0;
        if (valueArr[x]==valueArr[x+1]&&valueArr[x]==valueArr[x+2]){

            System.out.println("Equal");

        }else {
            System.out.println("Not equal");
        }
    }
}
