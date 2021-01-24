package Exceptions_List_Threads_Files.MultipleExeptions;

public class MyClass {

    public static void main(String[] args) {
        div (1,2);
        System.out.println(div(2,3));
    }

    //throws - define the type of Exception the method can throw
    static int div(int a, int b) throws ArithmeticException{
        if (b==0){
            //throw - keyword throws(виділяє) the corresponding exception, along with the custom message
            throw new ArithmeticException("Division by Zero");
        } else {
            return a/b;
        }
    }
}
