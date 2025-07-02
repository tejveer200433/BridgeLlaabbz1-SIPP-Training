package inherit;


class Employee {
 String name;
 String id;
 double salary;

 public Employee(String name, String id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 public void displayDetails() {
     System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
 }
}

class Manager extends Employee {
 int teamSize;

 public Manager(String name, String id, double salary, int teamSize) {
     super(name, id, salary);
     this.teamSize = teamSize;
 }


 public void displayDetails() {
     super.displayDetails();
     System.out.println("Team Size: " + teamSize);
 }
}

class Developer extends Employee {
 String programmingLanguage;

 public Developer(String name, String id, double salary, String programmingLanguage) {
     super(name, id, salary);
     this.programmingLanguage = programmingLanguage;
 }

 
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Programming Language: " + programmingLanguage);
 }
}

class Intern extends Employee {
 String internshipDuration;

 public Intern(String name, String id, double salary, String internshipDuration) {
     super(name, id, salary);
     this.internshipDuration = internshipDuration;
 }

 public void displayDetails() {
     super.displayDetails();
     System.out.println("Internship Duration: " + internshipDuration);
 }
}

public class EmployeeManagementSystem {
 public static void main(String[] args) {
     Manager manager = new Manager("Alice", "M001", 80000, 10);
     Developer developer = new Developer("Bob", "D002", 70000, "Java");
     Intern intern = new Intern("Charlie", "I003", 20000, "6 months");

     System.out.println("--- Employee Management System ---");
     manager.displayDetails();
     developer.displayDetails();
     intern.displayDetails();
 }
}