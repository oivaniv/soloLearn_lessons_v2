package moreOnClasses.inheritance;

import OOP.Classes.Animal;

//Here we initialize that class Dog inheriting class Animals
public class Dog extends Animal {

    //Need to investigate what is that!
    @Override
    public void bark() {
        super.bark();
    }

    //Here we create constructor Dog of class Dog and set value for variable legs
    Dog(){
        legs=4;
    }
}