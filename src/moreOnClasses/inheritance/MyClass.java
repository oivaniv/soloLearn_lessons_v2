package moreOnClasses.inheritance;

import OOP.Classes.Animal;

public class MyClass {
    public static void main(String[] args) {

        //Here we initialize object givno of Dog class (constructor)
        Dog givno = new Dog();

        //Here we call method eat
        givno.eat();
        System.out.println(givno.getLegs());

        //Constructor isn't Inherited from super class, so we can use variable
        //System.out.println(givno.legs);

        //Animal dog1 = new Dog();
        //dog1.eat();
    }
}
