package Loops;

public class forLoop {
    public static void main(String[] arg){
        int a = 1;
        for (int x=1;x<=100;x=x+a){
            a=x+a;
            System.out.println("The x value is " + x);
            System.out.println("The a value is " + a);
        }
    }
}
