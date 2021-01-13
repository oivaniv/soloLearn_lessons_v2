package OOP.Classes;

public class Animal {
    public static int counter;

    protected int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void eat(){
        System.out.println("Animal eats");
    }
    public void bark(){
        System.out.println("Woof-Woof");
    }

    public  void main(String[] args) {
        System.out.println(counter);
        System.out.println();

        Animal.counter = 5;

    }


}
