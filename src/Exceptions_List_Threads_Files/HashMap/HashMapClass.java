package Exceptions_List_Threads_Files.HashMap;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap <String, Integer> points = new HashMap<>();
        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);

        //To show element by key
        System.out.println(points.get("Rob"));

        //If we try to get element with key which isn't added we will see null
        System.out.println(points.get("John"));

        //Return bool value is this key in the HashMap
        System.out.println(points.containsKey("Dave"));

        //Return bool value is this value in the HashMap
        System.out.println(points.containsValue(1));

        System.out.println(points.size());

    }
}
