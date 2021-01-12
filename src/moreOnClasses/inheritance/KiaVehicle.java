package moreOnClasses.inheritance;

import OOP.Classes.Vehicle;

public class KiaVehicle extends Vehicle {
    public static void main(String[] args) {
        createRioKia();
    }

    public static void createCeedKia() {
        Vehicle ceedKia = new Vehicle(100, 16, "Blue");

    }

    public static void createRioKia() {
        Vehicle rioKia = new Vehicle();
        rioKia.wheels = 17;
        rioKia.setMaxSpeed(150);
        rioKia.setColour("Red");
        System.out.println(rioKia.getMaxSpeed());
        System.out.println(rioKia.getColour());
    }
}
