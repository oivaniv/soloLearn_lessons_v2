package OOP;

public class OOP {

//    public static void sayHello (){
//        System.out.println("Hello World");
//    }

    public static void sayHelloParameters(String myParameter){
        System.out.println("Hello " + myParameter);
    }

    public static void main (String[] args){
//        sayHello();
//        sayHello();
        sayHelloParameters("Gay");
        sayHelloParameters("Pidor");
    }
}
