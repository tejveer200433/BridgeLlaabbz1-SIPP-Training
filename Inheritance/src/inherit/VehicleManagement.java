package inherit;

interface Refuelable {
 void refuel();
}

class VehicleSystem {
 double maxSpeed;
 String model;

 public VehicleSystem(double maxSpeed, String model) {
     this.maxSpeed = maxSpeed;
     this.model = model;
 }
}

class ElectricVehicle extends VehicleSystem {
 public ElectricVehicle(double maxSpeed, String model) {
     super(maxSpeed, model);
 }

 public void charge() {
     System.out.println(model + " is charging.");
 }
}

class PetrolVehicle extends VehicleSystem implements Refuelable {
 public PetrolVehicle(double maxSpeed, String model) {
     super(maxSpeed, model);
 }

 
 public void refuel() {
     System.out.println(model + " is refueling.");
 }
}

public class VehicleManagement {
 public static void main(String[] args) {
     ElectricVehicle tesla = new ElectricVehicle(250, "Tesla Model S");
     PetrolVehicle ford = new PetrolVehicle(200, "Ford Focus");

     System.out.println("--- Vehicle Management System (Hybrid) ---");
     tesla.charge();
     ford.refuel();
 }
}