package Exceptions_List_Threads_Files.Array_Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorClass {

    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("tiger");
        animals.add("lion");
        animals.add("god");
        animals.add("pig");
        animals.add("squirrel");

        System.out.println(animals);

        //We initialize variable it of Iterator class, and assign value
        Iterator<String> it = animals.iterator();

        //String value = it.next();
        //System.out.println(value);
        //System.out.println(it.next());

        //Typically Iterator used for loops
        //.hasNext return true if there is next element, return false if no next element
        while (it.hasNext()){
            String loopValue = it.next();
            System.out.println(loopValue);
        }
    }
}

