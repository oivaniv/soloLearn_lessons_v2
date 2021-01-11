package OOP.Classes;


public class Opels {
    public static void main(String[] args) {
        createAstra();
        Vehicle.horn();

    }

    public static void createAstra() {

        //In this method we use object instead the constructor, assign the value for attributes
        //Here we initialize the object of Vehicle class
        Vehicle astraOpel = new Vehicle();

        //Here we assign the values for object attributes
        astraOpel.colour = "Red";
        System.out.println(astraOpel.colour);
        astraOpel.wheels = 16;
        astraOpel.fuelCapacity = 5.5;

        //Here we use Setter method to assign value to maxSpeed. We can't assign directly, cause the attribute is private
        astraOpel.setMaxSpeed(100);
        //Here we check the maxSpeed value after assigh by Setter
        System.out.println(astraOpel.getMaxSpeed());

        //Here we create new variable and assign value (value + value form Getter of maxSpeed)
        int TopMaxSpeed = 100 + astraOpel.getMaxSpeed();
        System.out.println(TopMaxSpeed);

    }

    public static void createVectra() {

        //In this method we use object instead the constructor, assign the value for attributes
        //Here we initialize the object of Vehicle class
        Vehicle vectraOpel = new Vehicle();

        //Here we assign the values for object attributes
        vectraOpel.colour = "Blue";
        vectraOpel.getMaxSpeed();
        vectraOpel.wheels = 17;
        vectraOpel.fuelCapacity = 6.4;
        vectraOpel.horn();
        //Here we check that MaxSpeed value isn't assign, so it should be 0. Cause we didn't use setMaxSpeed
        System.out.println(vectraOpel.getMaxSpeed());

    }

    public static void createCadetOpel() {
        //In this method we use constructor with few parameters and assign parameters value to the attributes inside the constructor
        Vehicle cadetOpel = new Vehicle(80, 14, "Green");

        cadetOpel.fuelCapacity = 10;
        cadetOpel.horn();
        System.out.println("The speed is: " + cadetOpel.getMaxSpeed());

    }

    public static void createCorsaOpel() {
        //In this method we use constructor Vehicle without parameters (this constructor have the default value inside)
        Vehicle corsaOpel = new Vehicle();
        System.out.println("Opel Corsa colour is: " + corsaOpel.colour);

    }

    public static void createCalibraOpel() {
        //In this method we use constructor Vehicle with parameter to set the color
        Vehicle calibraOpel = new Vehicle("Black");
        System.out.println("Opel Caliber colour is: " + calibraOpel.colour);
    }

    public static void createInsignia() {
        //In this method we use constructor with few parameters and assign parameters value to the attributes inside the constructor
        Vehicle insigniaOpel = new Vehicle(200, 20, "Grey");
        System.out.println("Opel Insignia colour is: " + insigniaOpel.colour);
        System.out.println("Opel Insignia Speed is: " + insigniaOpel.getMaxSpeed());
        System.out.println("Opel Insignia wheels is: " + insigniaOpel.wheels);


    }

}
