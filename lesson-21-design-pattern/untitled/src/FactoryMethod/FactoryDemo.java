package FactoryMethod;

import java.util.Scanner;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập loại pet: ");
        String typeAnimal = sc.next();

        Animal animal = AnimalFactory.getAnimal(typeAnimal);
        System.out.println("Animal'sound: " + animal.makeSound());

    }
}
