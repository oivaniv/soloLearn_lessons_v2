package moreOnClasses.typeCasting;

import moreOnClasses.abstract_new.Animal;
import moreOnClasses.abstract_new.Cat;

public class Downcasting {
    public static void main(String[] args) {
        //Here is the example of Downcasting, when we cast (передаємо) an object of it superclass to its subclass
        //Ми змінюємо тип обєкту на тип сабкласу
        //Ми ініціалізуємо змінну а типу Animal, і надаємо їй значення обєкту Cat. Далі ми для змінної а змінюємо тип з Animal до Cat (понижуємо тип, так як Cat унаслідувано від Animal)
        //і викликаємо метод

        Animal a = new Cat();
        ((Cat)a).makeSound();
    }
}
