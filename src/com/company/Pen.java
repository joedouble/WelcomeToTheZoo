package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pen {

    String nameOfPen;

    private List<Animal> myAnimals = new ArrayList<>();
    private List<BabyAnimal> myBabyAnimals = new ArrayList<>();


    public String getNameOfPen() {
        return nameOfPen;
    }

    public void setNameOfPen(String nameOfPen) {
        this.nameOfPen = nameOfPen;
    }

    public void addAnimalToPen(Animal animal) {
        myAnimals.add(animal);
    }


    public void addBabyAnimalToPen(BabyAnimal babyAnimal) {
        myBabyAnimals.add(babyAnimal);
    }

    public List<Animal> getMyAnimals() {
        return myAnimals;
    }

    public void setMyAnimals(List<Animal> myAnimals) {
        this.myAnimals = myAnimals;
    }

    public List<BabyAnimal> getMyBabyAnimals() {
        return myBabyAnimals;
    }

    public void setMyBabyAnimals(List<BabyAnimal> myBabyAnimals) {
        this.myBabyAnimals = myBabyAnimals;
    }
}
