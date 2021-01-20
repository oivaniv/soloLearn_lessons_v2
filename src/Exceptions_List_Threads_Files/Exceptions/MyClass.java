package Exceptions_List_Threads_Files.Exceptions;

public class MyClass {
    public static void main(String[] args) {
        // We use try{}catch{} to verify part of code. We check is the error here. If code fail we show some message.
        try {
            int a[] = new int[2];
            System.out.println(a[5]);
        } catch (Exception e){
            System.out.println("An error occurred");
        }
    }
}
