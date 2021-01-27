package Quiz.Module6_BowlingGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BowlingTest {
    static HashMap<String, Integer> players = new HashMap<>();

    public static void main(String[] args) {
        addPlayer();
        getWinner();
    }

    public static void addPlayer() {
        players.put("Oleh", 100);
        players.put("Ivan", 200);
        players.put("Petro", 300);

    }

    public static String getWinner() {

        System.out.println(players);

        System.out.println(players.values());


//        for (Map.Entry<String, Integer> values : players.entrySet()) {
//            //System.out.println(values.getValue());
//            if (values.getValue() > maxValue) {
//                maxValue = values.getValue();
//            }
//        }
//        System.out.println(maxValue);
//
//        System.out.println(players.get(100));
//        System.out.println(players.get("Oleh"));

        int maxValue = 0;
        String maxKey = "none";
        for (String i: players.keySet()){
//            System.out.println("key: " + i + " value: " + players.get(i));
            if (players.get(i)>maxValue){
                maxValue=players.get(i);
                maxKey = i;
            }
        }

        System.out.println(maxKey);


        return maxKey;
    }
}


