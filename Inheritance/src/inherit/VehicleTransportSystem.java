package inherit;

//Vehicle and Transport System
class Vehicle {
 double maxSpeed;
 String fuelType;

 public Vehicle(double maxSpeed, String fuelType) {
     this.maxSpeed = maxSpeed;
     this.fuelType = fuelType;
 }

 public void displayInfo() {
     System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
 }
}

class Car extends Vehicle {
 int seatCapacity;

 public Car(double maxSpeed, String fuelType, int seatCapacity) {
     super(maxSpeed, fuelType);
     this.seatCapacity = seatCapacity;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Seat Capacity: " + seatCapacity);
 }
}

class Truck extends Vehicle {
 double cargoCapacity;

 public Truck(double maxSpeed, String fuelType, double cargoCapacity) {
     super(maxSpeed, fuelType);
     this.cargoCapacity = cargoCapacity;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
 }
}

class Motorcycle extends Vehicle {
 boolean hasSidecar;

 public Motorcycle(double maxSpeed, String fuelType, boolean hasSidecar) {
     super(maxSpeed, fuelType);
     this.hasSidecar = hasSidecar;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Has Sidecar: " + hasSidecar);
 }
}

public class VehicleTransportSystem {
 public static void main(String[] args) {
     Vehicle[] vehicles = new Vehicle[3];
     vehicles[0] = new Car(180, "Petrol", 4);
     vehicles[1] = new Truck(100, "Diesel", 15.0);
     vehicles[2] = new Motorcycle(150, "Petrol", false);

     System.out.println("--- Vehicle and Transport System ---");
     for (Vehicle v : vehicles) {
         v.displayInfo();
     }
 }
}