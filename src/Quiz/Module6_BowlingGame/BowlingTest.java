package Quiz.Module6_BowlingGame;

import java.util.HashMap;

public class BowlingTest {
        static HashMap<String, Integer> players = new HashMap<>();

    public static void main(String[] args) {
        addPlayer();
        getWinner();
    }

        public static void addPlayer(){
            players.put("Oleh", 100);
            players.put("Ivan", 200);
            players.put("Petro", 300);

        }

        public static String getWinner(){

            System.out.println(players);

            System.out.println(players.values());

            return "Oleh";
        }
    }


