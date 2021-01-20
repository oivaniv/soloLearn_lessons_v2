package moreOnClasses.comparingObjects;

import java.util.Objects;

public class Animal {
    String name;
    int legs;
    Animal(String n, int l){
        name = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return legs == animal.legs && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, legs);
    }
}
