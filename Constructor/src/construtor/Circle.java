package construtor;

class Circle {
    double radius;

    public Circle() {
        this(1.0); // Default radius
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + String.format("%.2f", Math.PI * radius * radius));
        System.out.println("Circumference: " + String.format("%.2f", 2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 Details:");
        circle1.displayCircleDetails();
        System.out.println();

        Circle circle2 = new Circle(5.0);
        System.out.println("Circle 2 Details:");
        circle2.displayCircleDetails();
        System.out.println();

        Circle circle3 = new Circle(10.5);
        System.out.println("Circle 3 Details:");
        circle3.displayCircleDetails();
    }
}
