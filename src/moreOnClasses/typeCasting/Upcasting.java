package moreOnClasses.typeCasting;

import OOP.Classes.Animal;
import moreOnClasses.inheritance.Cat;

public class Upcasting {
    public static void main(String[] args) {
        //Here is the example of upcasting, when we cast (передаємо) an instance of a subclass to its superclass
        //Ми змінюжємо тип обекту на тип супер класу
        //Тут ми ініціалізуємо змінну а типу Animal і надаємо їй значення обєкту Cat. Далі викликаємо обєкт через змінну і виконуємо один з методів цього обєкту

        Animal a = new Cat();
        a.makeSound();

    }
}
