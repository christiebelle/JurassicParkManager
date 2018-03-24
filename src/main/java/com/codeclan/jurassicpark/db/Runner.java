package com.codeclan.jurassicpark.db;

import com.codeclan.jurassicpark.db.db.DBHelper;
import com.codeclan.jurassicpark.db.models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Park park = new Park("Jurassic Park");
        DBHelper.saveOrUpdate(park);

        Paddock paddock1 = new Paddock("Green Gully", 10, park);
        DBHelper.saveOrUpdate(paddock1);
        Paddock paddock2 = new Paddock("Arid Desert", 10, park);
        DBHelper.saveOrUpdate(paddock2);
        Paddock paddock3 = new Paddock("Misty Mountains", 10, park);
        DBHelper.saveOrUpdate(paddock3);
        Paddock paddock4 = new Paddock("The Great Plains", 10, park);
        DBHelper.saveOrUpdate(paddock4);

        Carnivore carnivore1 = new Carnivore(SpeciesType.TREX, "Fluffy", 30, 70, paddock1);
        DBHelper.saveOrUpdate(carnivore1);
        Carnivore carnivore2 = new Carnivore(SpeciesType.VELOCIRAPTOR, "Blue", 4, 50, paddock2);
        DBHelper.saveOrUpdate(carnivore2);
        Carnivore carnivore3 = new Carnivore(SpeciesType.VELOCIRAPTOR, "Athena", 10, 90, paddock2);
        DBHelper.saveOrUpdate(carnivore3);
        Carnivore carnivore4 = new Carnivore(SpeciesType.TREX, "Trevor", 16, 70, paddock1);
        DBHelper.saveOrUpdate(carnivore4);

        Herbivore herbivore1 = new Herbivore(SpeciesType.BRACHIOSAURUS, "Betty", 20, 50, paddock3);
        DBHelper.saveOrUpdate(herbivore1);
        Herbivore herbivore2 = new Herbivore(SpeciesType.BRACHIOSAURUS, "Barbara", 18, 50, paddock4);
        DBHelper.saveOrUpdate(herbivore2);
        Herbivore herbivore3 = new Herbivore(SpeciesType.TRICERATOPS, "Terry", 37, 80, paddock3);
        DBHelper.saveOrUpdate(herbivore3);
        Herbivore herbivore4 = new Herbivore(SpeciesType.TRICERATOPS, "Thomas", 42, 80, paddock4);
        DBHelper.saveOrUpdate(herbivore4);

//        test can get List of Objects
        List<Herbivore> foundHerbivores = DBHelper.getAll(Herbivore.class);
        List<Carnivore> foundCarnivores = DBHelper.getAll(Carnivore.class);
//        test can get all Dinosaurs
        List<Dinosaur> foundDinosaurs = DBHelper.getAll(Dinosaur.class);
        List<Paddock> foundPaddocks = DBHelper.getAll(Paddock.class);

//        test can get Individual Objects
        Herbivore foundHerbivore = DBHelper.find(Herbivore.class, herbivore2.getId());
        Carnivore foundCarnivore = DBHelper.find(Carnivore.class, carnivore3.getId());
//        test can use generic Dinosaur class
        Dinosaur foundDinosaur = DBHelper.find(Dinosaur.class, carnivore1.getId());
        Paddock foundPaddock = DBHelper.find(Paddock.class, paddock2.getId());


    }

}


