package com.company;

public class BabyAnimal extends Animal {

    private int age;

    public BabyAnimal(int age, String species, String size, String gender) {
        super(species, size, gender);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
