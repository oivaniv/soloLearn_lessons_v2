package OOP.Reference;

import OOP.OOP;

public class ReferenceTypes {
    public static void main(String[] args) {
        //Here we initialize new object of Person class
//        Person olehPerson;
//        olehPerson = new Person("Oleh");

        //Here we initialize new object of Person class (another way)
        Person olehPerson = new Person("Oleh");
        //Set the value for Age variabel by Setter method
        olehPerson.setAge(20);
        //Show constructor's name and age
        System.out.println(olehPerson + " age is: " + olehPerson.getAge());
        //Call celebrateBirthday method
        celebrateBirthday(olehPerson);
        //Show constructor Oleh age value after the method
        System.out.println(olehPerson.getAge());

    }

    static void celebrateBirthday(Person igorPerson) {

        System.out.println( igorPerson +" age is: " + igorPerson.getAge());

        igorPerson.setAge(igorPerson.getAge() + 1);

    }
}
