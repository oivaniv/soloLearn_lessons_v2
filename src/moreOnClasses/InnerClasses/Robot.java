package moreOnClasses.InnerClasses;

public class Robot {
    int id;

    Robot(int i){
        id = i;
        Brain b = new Brain();
        b.think();
    }

    public static void main(String[] args) {
        Robot Wolly = new Robot(3);
    }
    private class Brain{
        public void think(){
            System.out.println(id + " is thinking");
        }
    }
}
