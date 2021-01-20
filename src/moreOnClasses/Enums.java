package moreOnClasses;

public class Enums {
    enum Rank{
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }

    public static void main(String[] args) {
        Rank a = Rank.SOLDIER;

        switch (a){
            case SOLDIER -> System.out.println("Soldier says Hi!");
            case SERGEANT -> System.out.println("Sergeant says Hello!");
            case CAPTAIN -> System.out.println("Captain says Welcome!");
        }
    }

}
