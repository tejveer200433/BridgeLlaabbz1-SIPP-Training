package encapsulte;


abstract class Vehicle {
 private String vehicleNumber;
 private String type;
 private double rentalRate; // per day

 public Vehicle(String vehicleNumber, String type, double rentalRate) {
     this.vehicleNumber = vehicleNumber;
     this.type = type;
     this.rentalRate = rentalRate;
 }

 public String getVehicleNumber() {
     return vehicleNumber;
 }

 public String getType() {
     return type;
 }

 public double getRentalRate() {
     return rentalRate;
 }

 public void setRentalRate(double rentalRate) {
     this.rentalRate = rentalRate;
 }

 public abstract double calculateRentalCost(int days);

 public void displayVehicleDetails() {
     System.out.println("Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rental Rate: $" + rentalRate + "/day");
 }
}


class Car extends Vehicle {
 private int numberOfSeats;

 public Car(String vehicleNumber, String type, double rentalRate, int numberOfSeats) {
     super(vehicleNumber, type, rentalRate);
     this.numberOfSeats = numberOfSeats;
 }

 public int getNumberOfSeats() {
     return numberOfSeats;
 }

 public void setNumberOfSeats(int numberOfSeats) {
     this.numberOfSeats = numberOfSeats;
 }

 public double calculateRentalCost(int days) {
     return getRentalRate() * days;
 }

 
 public void displayVehicleDetails() {
     super.displayVehicleDetails();
     System.out.println("Specifics: " + numberOfSeats + " seats");
 }
}


class Bike extends Vehicle {
 private boolean isGeared;

 public Bike(String vehicleNumber, String type, double rentalRate, boolean isGeared) {
     super(vehicleNumber, type, rentalRate);
     this.isGeared = isGeared;
 }

 public boolean isGeared() {
     return isGeared;
 }

 public void setGeared(boolean geared) {
     isGeared = geared;
 }


 public double calculateRentalCost(int days) {
     return getRentalRate() * days;
 }

 
 public void displayVehicleDetails() {
     super.displayVehicleDetails();
     System.out.println("Specifics: " + (isGeared ? "Geared" : "Non-geared"));
 }
}


class Truck extends Vehicle {
 private double cargoCapacityTons;

 public Truck(String vehicleNumber, String type, double rentalRate, double cargoCapacityTons) {
     super(vehicleNumber, type, rentalRate);
     this.cargoCapacityTons = cargoCapacityTons;
 }

 public double getCargoCapacityTons() {
     return cargoCapacityTons;
 }

 public void setCargoCapacityTons(double cargoCapacityTons) {
     this.cargoCapacityTons = cargoCapacityTons;
 }

 @Override
 public double calculateRentalCost(int days) {
     return getRentalRate() * days * 1.2; // 20% extra for trucks
 }

 @Override
 public void displayVehicleDetails() {
     super.displayVehicleDetails();
     System.out.println("Specifics: " + cargoCapacityTons + " tons cargo capacity");
 }
}

//Interface Insurable
interface Insurable {
 double calculateInsurance();
 String getInsuranceDetails();
}

//Example of a vehicle that is insurable
class InsurableCar extends Car implements Insurable {
 private String insurancePolicyNumber;
 private double insurancePremiumRate;

 public InsurableCar(String vehicleNumber, String type, double rentalRate, int numberOfSeats, String insurancePolicyNumber, double insurancePremiumRate) {
     super(vehicleNumber, type, rentalRate, numberOfSeats);
     this.insurancePolicyNumber = insurancePolicyNumber;
     this.insurancePremiumRate = insurancePremiumRate;
 }

 public String getInsurancePolicyNumber() {
     return insurancePolicyNumber;
 }

 private void setInsurancePolicyNumber(String insurancePolicyNumber) { // Restricted access
     this.insurancePolicyNumber = insurancePolicyNumber;
 }

 @Override
 public double calculateInsurance() {
     return getRentalRate() * insurancePremiumRate * 30; // Assuming monthly premium based on daily rental rate
 }

 @Override
 public String getInsuranceDetails() {
     return "Insurance Policy: " + insurancePolicyNumber + ", Premium: $" + String.format("%.2f", calculateInsurance());
 }

 @Override
 public void displayVehicleDetails() {
     super.displayVehicleDetails();
     System.out.println(getInsuranceDetails());
 }
}

public class VehicleRentalSystem {

 public static void processRental(Vehicle vehicle, int days) {
     System.out.println("\n--- Processing Rental for " + vehicle.getType() + " (" + vehicle.getVehicleNumber() + ") ---");
     vehicle.displayVehicleDetails();
     System.out.println("Rental Cost for " + days + " days: $" + String.format("%.2f", vehicle.calculateRentalCost(days)));

     if (vehicle instanceof Insurable) {
         System.out.println(((Insurable) vehicle).getInsuranceDetails());
     }
 }

 public static void main(String[] args) {
     Vehicle car1 = new InsurableCar("C001", "Sedan", 50.0, 5, "INS98765", 0.1);
     Vehicle bike1 = new Bike("B001", "Motorcycle", 30.0, true);
     Vehicle truck1 = new Truck("T001", "Heavy Duty", 100.0, 5.0);
     Vehicle car2 = new Car("C002", "SUV", 70.0, 7);

     System.out.println("--- Vehicle Rental System ---");
     Vehicle[] vehicles = {car1, bike1, truck1, car2};

     for (Vehicle v : vehicles) {
         processRental(v, 5);
     }
 }
}
