package moreOnClasses.Interface;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Meow");
    }

    @Override
    public void makeSound() {
        System.out.println("omnomnomnom");
    }
}
