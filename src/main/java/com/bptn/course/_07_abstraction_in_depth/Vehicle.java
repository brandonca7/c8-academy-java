package com.bptn.course._07_abstraction_in_depth;

public abstract class Vehicle {
    String make;
    String model;
    int year;
    boolean isEngineOn;

    public Vehicle(String make, String model, int year){
      this.make = make;
      this.model = model;
      this.year = year;
      this.isEngineOn = false; 
    }

    public void displayBasicInfo(){
      System.out.println(make+"\n"+model+"\n"+year);
    }

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void drive();
}


