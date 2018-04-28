package com.me;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Hank", "Bark Bark");
        Horse horse = new Horse("Seabiscuit", "Neigh Neigh");

        System.out.println(dog.name());
        System.out.println(dog.soundAnimalMakes());

        System.out.println("***********************");

        System.out.println(horse.name());
        System.out.println(horse.soundAnimalMakes());
    }
}
