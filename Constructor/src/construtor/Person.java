package construtor;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Person originalPerson = new Person("Alice", 30);
        System.out.println("Original Person Details:");
        originalPerson.displayPersonDetails();
        System.out.println();

        
        Person copiedPerson = new Person(originalPerson);
        System.out.println("Copied Person Details:");
        copiedPerson.displayPersonDetails();
        System.out.println();

  
        copiedPerson.name = "Bob";
        copiedPerson.age = 25;

        System.out.println("Original Person Details (after modification of copied):");
        originalPerson.displayPersonDetails();
        System.out.println();

        System.out.println("Copied Person Details (after modification):");
        copiedPerson.displayPersonDetails();
    }
}

