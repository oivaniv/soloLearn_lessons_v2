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

    public void makeSound(){
        System.out.println("Grrr..");
    }

    //Here we declare method which return int value
    int maxLegs(int a, int b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }

    //Here we overload method which return double value
    double maxLegs(double a, double b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }

    public  void main(String[] args) {
        System.out.println(counter);
        System.out.println();

        Animal.counter = 5;

        //Here we call the method, and by adding the parameter we chose which one we run.
        maxLegs(1, 5);
        System.out.println(maxLegs(1, 5));

        maxLegs(1.2, 5.6);
        System.out.println(maxLegs(1.2, 5.6));

    }


}
