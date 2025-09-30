package com.bptn.course._07_abstraction_in_depth;


public class VehicleManager {
  public static void main(String args[]){
    Car myCar = new Car("Honda", "Civic", 2023);
    myCar.displayBasicInfo();
    myCar.startEngine();
    myCar.drive();
    myCar.refuel(25);
    myCar.getFuelLevel();
    myCar.stopEngine();
    
    ElectricBike myBike = new ElectricBike("Trek", "E-Caliber", 2024);
    myBike.displayBasicInfo();
    myBike.startEngine();
    myBike.drive();
    myBike.charge(50);
    myBike.getBatteryLevel();
    myBike.stopEngine();

    FuelConsuming fuelVehicle = myCar;
    fuelVehicle.refuel(34);
    fuelVehicle.getFuelLevel();

    ElectricPowered electricVehicle = myBike;
    electricVehicle.charge(50);
    electricVehicle.getBatteryLevel();

  }
}
