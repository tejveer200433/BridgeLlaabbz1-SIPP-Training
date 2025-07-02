package inherit;


class Animal {
 String name;
 int age;

 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

class Dog extends Animal {
 public Dog(String name, int age) {
     super(name, age);
 }

 public void makeSound() {
     System.out.println("Woof!");
 }
}

class Cat extends Animal {
 public Cat(String name, int age) {
     super(name, age);
 }

 public void makeSound() {
     System.out.println("Meow!");
 }
}

class Bird extends Animal {
 public Bird(String name, int age) {
     super(name, age);
 }


 public void makeSound() {
     System.out.println("Chirp!");
 }
}

public class AnimalHierarchy {
 public static void main(String[] args) {
     Dog dog = new Dog("Buddy", 5);
     Cat cat = new Cat("Whiskers", 3);
     Bird bird = new Bird("Chirpy", 1);

     System.out.println("--- Animal Hierarchy ---");
     dog.makeSound();
     cat.makeSound();
     bird.makeSound();
 }
}
