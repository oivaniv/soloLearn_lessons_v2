package Exceptions_List_Threads_Files.Array_Linked_List;

import java.util.ArrayList;

public class ArrayListClass {

    ArrayList<String> colors = new ArrayList<>();

    public static void main(String[] args) {


    }

    public void AddValueArrayList() {
        //.add() - to add value
        colors.add("Black");
        colors.add("White");
        colors.add("Green");
        colors.add("Blue");
    }

    public void ShowArray() {
        System.out.println(colors);
    }

    public void DeleteElementArrayList(String elementValue) {
        //.remove() - to remove value
        colors.remove(elementValue);
    }

    public void DifferentCommandsArrayList() {
        //To show one element by index
        System.out.println(colors.get(1));
        //To show returned bool value
        System.out.println(colors.contains("White"));
        //To show the ArrayList size
        System.out.println(colors.size());
    }

    public void ClearArrayList() {
        //.clear - remove all elements
        colors.clear();
    }
}

