package Exceptions_List_Threads_Files.Array_Linked_List;

import java.util.ArrayList;
import java.util.Collections;

public class SortingLists {
    public static void main(String[] args) {
        ArrayList <String> animals = new ArrayList<>();
        animals.add("tiger");
        animals.add("lion");
        animals.add("god");
        animals.add("pig");
        animals.add("squirrel");

        System.out.println(animals);

        //To sort list form min to max
        Collections.sort(animals);
        System.out.println(animals);

        //To revers list
        Collections.reverse(animals);
        System.out.println(animals);

        //To show list max value
        System.out.println(Collections.max(animals));

        //To shuffle list values
        Collections.shuffle(animals);
        System.out.println(animals);

    }
}
