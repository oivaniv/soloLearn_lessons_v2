package moreOnClasses.anonymousClasses;

public class Machine {
    public void start(){
        System.out.println("Starting...");
    }

    public static void main(String[] args) {

        Machine m1 = new Machine(){
            //Here we change the start method to the new one
            @Override
            public void start() {
                System.out.println("The new start...");
            }
        };
        // So after this manipulation our start method for object a would be changed.
        m1.start();

        Machine m2 = new Machine();
        m2.start();
    }
}
