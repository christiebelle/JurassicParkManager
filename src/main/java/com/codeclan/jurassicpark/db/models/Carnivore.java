package com.codeclan.jurassicpark.db.models;

public class Carnivore extends Dinosaur {

    private int hunger;

    public Carnivore() {
    }

    public Carnivore(SpeciesType species, String name, int age, int danger, Paddock paddock) {
        super(species, name, age, danger, paddock);
        this.hunger = 0;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void getFed(){
//        feeding Dinosaur resets Hunger to 0
        this.hunger = 0;
    }

//    we need a way for the Carnivore to get Hungry
}