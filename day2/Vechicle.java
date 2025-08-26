
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// Superclass
abstract class Vehicle {
    protected String vehicleNumber;
    protected LocalDateTime entryTime;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.entryTime = LocalDateTime.now();
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public abstract double calculateFee(LocalDateTime exitTime);
}

// Subclass
class Car extends Vehicle {
    private static final double BASE_FEE = 50.0;
    private static final double EXTRA_HOUR_FEE = 30.0;

    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateFee(LocalDateTime exitTime) {
        long hours = ChronoUnit.HOURS.between(entryTime, exitTime);
        long minutes = ChronoUnit.MINUTES.between(entryTime, exitTime) % 60;
        double totalHours = hours + (double) minutes / 60;

        if (totalHours <= 1) {
            return BASE_FEE;
        } else {
            return BASE_FEE + (totalHours - 1) * EXTRA_HOUR_FEE;
        }
    }
}

// Subclass
class Bike extends Vehicle {
    private static final double BASE_FEE = 20.0;
    private static final double EXTRA_HOUR_FEE = 10.0;

    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateFee(LocalDateTime exitTime) {
        long hours = ChronoUnit.HOURS.between(entryTime, exitTime);
        long minutes = ChronoUnit.MINUTES.between(entryTime, exitTime) % 60;
        double totalHours = hours + (double) minutes / 60;

        if (totalHours <= 1) {
            return BASE_FEE;
        } else {
            return BASE_FEE + (totalHours - 1) * EXTRA_HOUR_FEE;
        }
    }
}

// Subclass
class Truck extends Vehicle {
    private static final double BASE_FEE = 100.0;
    private static final double EXTRA_HOUR_FEE = 50.0;

    public Truck(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateFee(LocalDateTime exitTime) {
        long hours = ChronoUnit.HOURS.between(entryTime, exitTime);
        long minutes = ChronoUnit.MINUTES.between(entryTime, exitTime) % 60;
        double totalHours = hours + (double) minutes / 60;

        if (totalHours <= 1) {
            return BASE_FEE;
        } else {
            return BASE_FEE + (totalHours - 1) * EXTRA_HOUR_FEE;
        }
    }
}

public class ParkingLotSystem {
    public static void main(String[] args) {
        Car car = new Car("KA05AB1234");
        Bike bike = new Bike("KA05XY7890");
        Truck truck = new Truck("KA09TR5566");

        // Example Run times
        LocalDateTime carExit = LocalDateTime.of(2025, 8, 26, 13, 30);
        LocalDateTime bikeExit = LocalDateTime.of(2025, 8, 26, 12, 0);
        LocalDateTime truckExit = LocalDateTime.of(2025, 8, 26, 14, 0);

        // Setting entry times for the example
        car.entryTime = LocalDateTime.of(2025, 8, 26, 10, 0);
        bike.entryTime = LocalDateTime.of(2025, 8, 26, 11, 15);
        truck.entryTime = LocalDateTime.of(2025, 8, 26, 9, 30);

        System.out.println("Car KA05AB1234 exits at 1:30 PM. Fee: " + car.calculateFee(carExit));
        System.out.println("Bike KA05XY7890 exits at 12:00 PM. Fee: " + bike.calculateFee(bikeExit));
        System.out.println("Truck KA09TR5566 exits at 2:00 PM. Fee: " + truck.calculateFee(truckExit));
    }
}