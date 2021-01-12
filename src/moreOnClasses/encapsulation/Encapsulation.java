package moreOnClasses.encapsulation;

import OOP.Classes.Vehicle;

public class Encapsulation {
    public static void main(String[] args) {

    }
    private double balance=0;

    public void deposit(double x){
        if (x>0){
            balance+=x;
        }
    }
    public void kredit(double y){
        balance=5;
    }

}
