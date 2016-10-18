package com.example.singhj48.week2;

/**
 * Created by singhj48 on 18/10/2016.
 */
public class Vehicle {
    public static int counter = 0;
    private String make;
    private int year;
    private String message;

    public Vehicle() {
        this.make ="Volvo" ;
        this.year = 2012;
        this.message = "this is the default message.";
    }

    public Vehicle(String make) {
        this();
        this.make = make;
        message = "you didn't type in the year value.";
        count();
    }

    public Vehicle(String make,int year) {
        this.year = year;
        this.make = make;
        this.message="your car is a "+ make+" built in "+year+" .";
        count();
    }
    public String getMessage() {
        return message;
    }
    @Override
    public String toString() {
        return message;
    }
    private void count(){
        this.counter++;
    }
}
