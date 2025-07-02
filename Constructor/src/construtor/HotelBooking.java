package construtor;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1 Details (Default Constructor):");
        booking1.displayBookingDetails();
        System.out.println();

        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Booking 2 Details (Parameterized Constructor):");
        booking2.displayBookingDetails();
        System.out.println();

        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Booking 3 Details (Copy Constructor, copied from Booking 2):");
        booking3.displayBookingDetails();
        System.out.println();

        // Demonstrate that they are separate objects
        booking3.guestName = "Jane Smith";
        booking3.nights = 5;

        System.out.println("Booking 2 Details (after modification of Booking 3):");
        booking2.displayBookingDetails();
        System.out.println();

        System.out.println("Booking 3 Details (after modification):");
        booking3.displayBookingDetails();
    }
}
