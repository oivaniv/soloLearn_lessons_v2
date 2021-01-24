package Exceptions_List_Threads_Files.Threads_V1;

public class MyClass {
    public static void main(String[] args) {
        Loader obj = new Loader();
        //when we create obj. and call its start() method, than run() method statements execute on a different thread
        obj.start();
        //Every Java thread is prioritized to help the operating system determine the order in which to schedule threads.
        //The priorities range from 1 to 10, with each thread defaulting to priority 5.
        //You can set the thread priority with the setPriority() method.
        obj.setPriority(6);
    }
}
