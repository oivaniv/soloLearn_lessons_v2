package Quiz.Module6_BowlingGame;

import java.util.HashMap;

public class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<>();
    }
    public void addPlayer(String name, int p){
        players.put(name, p);
    }

    public String getWinner(){

        System.out.println(players);

        System.out.println(players.values());




        return "Oleh";
    }
}
