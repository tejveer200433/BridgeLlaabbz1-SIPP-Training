package construtor;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    private static final double DAILY_RATE = 50.00; // Example daily rate

    public CarRental() {
        this.customerName = "Default Customer";
        this.carModel = "Sedan";
        this.rentalDays = 1;
        calculateTotalCost();
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    private void calculateTotalCost() {
        this.totalCost = this.rentalDays * DAILY_RATE;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + String.format("%.2f", totalCost));
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        System.out.println("Rental 1 Details (Default Constructor):");
        rental1.displayRentalDetails();
        System.out.println();

        CarRental rental2 = new CarRental("Alice Johnson", "SUV", 7);
        System.out.println("Rental 2 Details (Parameterized Constructor):");
        rental2.displayRentalDetails();
        System.out.println();

        CarRental rental3 = new CarRental("Bob Williams", "Luxury Car", 3);
        System.out.println("Rental 3 Details (Parameterized Constructor):");
        rental3.displayRentalDetails();
    }
}

