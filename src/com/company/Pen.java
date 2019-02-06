package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pen {

    private List<Animal> myAnimals = new ArrayList<>();
    private List<BabyAnimal> myBabyAnimals = new ArrayList<>();

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
