/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi2;

/**
 *
 * @author Admin
 */
/**
 * @param args the command line arguments
 */
class Animal {

    String name;

    void makeSound() {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    void otherMethod() {
        System.out.println("Animal make sound");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Meow Meow");
    }
}

public class JavaApplication18 {

    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Dog();
        animal.makeSound();

        Animal animal1 = new Cat();

        Cat cat = (Cat) animal1;
        cat.meow();
    }
}
