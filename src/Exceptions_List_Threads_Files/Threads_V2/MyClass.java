package Exceptions_List_Threads_Files.Threads_V2;

public class MyClass {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Loader());
        Thread.sleep(2000);
        t.start();
    }
}
