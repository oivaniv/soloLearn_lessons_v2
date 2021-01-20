package moreOnClasses.inheritance;

import OOP.Classes.Animal;

public class MyClass {
    public static void main(String[] args) {

        //Here we initialize object givno of Dog class (constructor)
        Dog givno = new Dog();

        //Here we call method eat
        //givno.eat();
        //System.out.println(givno.getLegs());

        //Constructor isn't Inherited from super class, so we can use variable
        //System.out.println(givno.legs);

        //Animal dog1 = new Dog();
        //dog1.eat();

        //Here we created 2 reference variables of type Animal, and pointed them to the Cat and Dog objects
        Animal a = new Dog();
        Animal b = new Cat();

        //Here we call the methods for each variable
        //As a variable is a Dog object we call makeSound method of the Dog class
        a.makeSound();
        //As b variable is a Cat object we call makeSound method of the Cat class
        b.makeSound();
    }
}
