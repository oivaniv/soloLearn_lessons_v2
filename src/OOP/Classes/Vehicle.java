package OOP.Classes;

public class Vehicle {

    //Class attributes
    private int maxSpeed;
    public int wheels;
    String colour;
    double fuelCapacity;

    //Class method
    public static void horn(){
        System.out.println("Beep!!!");
    }

    // Creating the Getter method
    public int getMaxSpeed(){
        return maxSpeed;
    }

    //Creating the Setter method
    public void setMaxSpeed(int mSpeed){
        this.maxSpeed = mSpeed;
    }

    //How to initialize the constructor without the parameters (can be used for setting the default values for object)
//    Vehicle(){
//        maxSpeed = 111;
//    }

    //How to initialize the constructor with few parameters
    public Vehicle(int mSpeed, int newWheels, String newColor){
        maxSpeed = mSpeed;
        wheels = newWheels;
        colour = newColor;
    }

    // Constructor without parameters, which set color to Yellow by setColour "Setter" method
    public Vehicle(){
        this.setColour("Yellow");
    }

    // Constructor with parameter, which assign value from parameter to "color" by setColor method
    Vehicle (String setColorValue){
        this.setColour(setColorValue);

    }
    //Setter for Vehicle constructor
    public void setColour(String setColorValue){
        this.colour = setColorValue;
    }

    public String getColour(){
        return colour;
    }
}
