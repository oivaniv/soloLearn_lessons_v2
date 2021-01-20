package moreOnClasses.comparingObjects;

public class MyClass {
    public static void main(String[] args) {
        Animal a1 = new Animal("Robby", 4);
        Animal a2 = new Animal("Robby", 4);
        System.out.println(a1.equals(a2));
    }
}
