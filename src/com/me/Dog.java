package com.me;

public class Dog implements IAnimal{

    private String name;
    private String soundAnimalMakes;
    private String thisIsWhatTheyEat;

    public Dog(String name, String soundAnimalMakes, String thisIsWhatTheyEat) {

        this.name = name;
        this.soundAnimalMakes = soundAnimalMakes;
        this.thisIsWhatTheyEat = thisIsWhatTheyEat;

    }

    public String thisIsWhatTheyEat(){

        return thisIsWhatTheyEat;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String soundAnimalMakes() {
        return soundAnimalMakes;
    }
}
