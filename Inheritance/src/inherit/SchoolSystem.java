package inherit;


class Person {
 String name;
 int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
}

class Teacher extends Person {
 String subject;

 public Teacher(String name, int age, String subject) {
     super(name, age);
     this.subject = subject;
 }

 public void displayRole() {
     System.out.println("Role: Teacher, Name: " + name + ", Age: " + age + ", Subject: " + subject);
 }
}

class Student extends Person {
 String grade;

 public Student(String name, int age, String grade) {
     super(name, age);
     this.grade = grade;
 }

 public void displayRole() {
     System.out.println("Role: Student, Name: " + name + ", Age: " + age + ", Grade: " + grade);
 }
}

class Staff extends Person {
 String department;

 public Staff(String name, int age, String department) {
     super(name, age);
     this.department = department;
 }

 public void displayRole() {
     System.out.println("Role: Staff, Name: " + name + ", Age: " + age + ", Department: " + department);
 }
}

public class SchoolSystem {
 public static void main(String[] args) {
     Teacher teacher = new Teacher("Mr. Smith", 40, "Math");
     Student student = new Student("Anna", 16, "10th Grade");
     Staff staff = new Staff("Ms. Jones", 35, "Administration");

     System.out.println("--- School System with Different Roles ---");
     teacher.displayRole();
     student.displayRole();
     staff.displayRole();
 }
}