package construtor;

class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
    }

    public static void main(String[] args) {
        // Using the default constructor
        Book book1 = new Book();
        System.out.println("Book 1 Details:");
        book1.displayBookDetails();
        System.out.println();

        // Using the parameterized constructor
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99);
        System.out.println("Book 2 Details:");
        book2.displayBookDetails();
    }
}