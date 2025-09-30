package com.bptn.course._07_abstraction_in_depth;

public class Car extends Vehicle implements FuelConsuming {
	   double fuelLevel;

	   public Car(String make, String model, int year){
	    super(make, model, year);
	    this.fuelLevel = 50.0;
	   }

	  @Override
	   public void startEngine(){
	    isEngineOn = true;
	    System.out.println("Car engine started.");
	   }

	  @Override
	   public void stopEngine(){
	    isEngineOn = false;
	    System.out.println("Car engine stopped.");
	   }

	  @Override
	  public void drive() {
	        if (isEngineOn && fuelLevel > 0) {
	            System.out.println(make + " " + model + ": Is smoothly driving down the road.");
	            fuelLevel -= 2.5; // Simulate fuel consumption
	            if (fuelLevel < 5) {
	                System.out.println("Warning: Low fuel in " + make + " " + model + "!");
	            }
	        } else if (!isEngineOn) {
	            System.out.println(make + " " + model + ": Cannot drive, engine is off.");
	        } else {
	            System.out.println(make + " " + model + ": Cannot drive, out of fuel!");
	        }
	    }

	  @Override
	  public void refuel(double liters){
	    this.fuelLevel = this.fuelLevel+liters;
	    System.out.println("Car refueled with "+this.fuelLevel);
	  }
	  
	  @Override
	  public double getFuelLevel(){
	    System.out.println("Car has "+ this.fuelLevel +" of fuel.");
	    return this.fuelLevel;
	  }
	}


