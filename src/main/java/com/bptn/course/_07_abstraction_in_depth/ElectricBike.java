package com.bptn.course._07_abstraction_in_depth;


public class ElectricBike extends Vehicle implements ElectricPowered {
    double batteryLevel;

   public ElectricBike(String make, String model, int year){
    super(make, model, year);
    this.batteryLevel = 50.0;
   }

  @Override
   public void startEngine(){
	  isEngineOn = true;
    System.out.println("ElectricBike engine started.");
   }

  @Override
   public void stopEngine(){
	  isEngineOn = false;
    System.out.println("ElectricBike engine stopped.");
   }

  @Override
  public void drive() {
      if (isEngineOn && batteryLevel > 5) { // Needs some charge to drive
          System.out.println(make + " " + model + ": Is silently cruising along.");
          batteryLevel -= 5.0; // Simulate battery consumption
          if (batteryLevel < 15) {
              System.out.println("Warning: Low battery on " + make + " " + model + "!");
          }
      } else if (!isEngineOn) {
          System.out.println(make + " " + model + ": Cannot drive, motor is off.");
      } else {
          System.out.println(make + " " + model + ": Cannot drive, battery too low!");
      }
  }

  @Override
  public void charge(double kWh){
    System.out.println("ElectricBike charged with "+kWh+"kWh.");
  }
  
  @Override
  public double getBatteryLevel(){
    System.out.println("ElectricBike has "+ this.batteryLevel +" of battery.");
    return this.batteryLevel;
  }
}

