package Quiz.Module6_BowlingGame;

import java.util.HashMap;

public class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public String getWinner() {

        //Initialize variables for maxValue and maxKey
        int maxValue = 0;
        String maxKey = "none";

        //Use for-each to loop all elements
        for (String i : players.keySet()) {
            //Use this to show elements of HashMap
//            System.out.println("key: " + i + " value: " + players.get(i));
            //Here we check if our value from Map bigger than our maxValue, if yes - set value to maxValue and set i to maxKey, if no - don't do anything
            if (players.get(i) > maxValue) {
                maxValue = players.get(i);
                maxKey = i;
            }
        }
        //Show maxKey value
        //System.out.println(maxKey);
        return maxKey;

    }
}
