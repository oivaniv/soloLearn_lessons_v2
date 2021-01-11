package OOP.Reference;

import OOP.Classes.Vehicle;

public class Reference {
    public static void main(String[] args) {
        int x = 5;
        addToOne(x);
        System.out.println("This is X value: " + x);

    }

    public static void addToOne(int number) {
        number = number + 1;
        System.out.println("This is number value: " + number);

    }
}
