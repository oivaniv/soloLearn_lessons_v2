package Exceptions_List_Threads_Files.Array_Linked_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        //Initialize LinkedList obj variable
        LinkedList<String> colors = new LinkedList<>();
        //.add() - to add value
        colors.add("Black");
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");

        //.remove() - to remove value
        colors.remove("Black");

        //To show all elements
        //System.out.println(colors);
        //To show one element by index
        //System.out.println(colors.get(1));
        //To show returned bool value
        //System.out.println(colors.contains("White"));
        //To show the LinkedList size
        //System.out.println(colors.size());

        //Use for-each, to show all elements of LinkedList
        //String - data type of LinkedList
        //s - variable which will have value of LinkedList
        //colors - LinkedList name
        for (String s:colors){
            System.out.println(s);
        }

        //Use default for to show all elements of LinkedList
        for (int x = 0; x<colors.size();x++){
            System.out.println(colors.get(x));
        }

        //.clear - remove all elements
        colors.clear();
        //System.out.println(colors);




        //Initialize variable arr and assign it object ArrayListClass
//        ArrayListClass arr = new ArrayListClass();
//        arr.AddValueArrayList();
//        arr.ShowArray();
//        arr.DeleteElementArrayList("White");
//        arr.ShowArray();
    }
}

