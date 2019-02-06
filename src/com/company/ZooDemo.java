package com.company;

import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

        Scanner numScanner = new Scanner(System.in);
        Scanner textScanner = new Scanner(System.in);
        int menuOption = 0;
        boolean keepRunning = false;
        String species = "";
        String size = "";
        String gender = "";
        Pen newPen = new Pen();
        boolean anotherAnimal = false;
        String nameOfPen = "";
        Zoo newZoo = new Zoo();
        boolean anotherPen = false;
        int age = 0;

        do {
            System.out.println("Welcome to the new Detroit Zoo.\n" +
                    "What would you like to do today?\n\n" +
                    "Press [1] to SET UP NEW PENS\n" +
                    "Press [2] to REMOVE PENS\n" +
                    "Press [3] to ADD AN ANIMAL TO A PEN\n" +
                    "Press [4] to ADD A BABY ANIMAL TO A PEN\n" +
                    "Press [5] to REMOVE ANIMALS AND BABY ANIMALS FROM PENS\n" +
                    "Press [6] to DISPLAY ALL THE ANIMALS IN A PEN\n" +
                    "Press [7] to DISPLAY ALL THE ANIMALS IN THE ZOO");
            menuOption = numScanner.nextInt();
            keepRunning = false;

            if (menuOption < 1 || menuOption > 4){
                System.out.println("Sorry.  That selection didn't work.  Please try again.\n");
                keepRunning = true;

            } else {

                switch (menuOption) {

                    case 1:

                        do {
                            System.out.println("Set up a new Pen\n");

                            System.out.println("What is the name of the new Pen");
                            nameOfPen = textScanner.nextLine();

                            newPen.setNameOfPen(nameOfPen);

                            newZoo.addAPenToZoo(newPen);

                            System.out.println("Would you like to add another pen?\n" +
                                    "Press [1] for YES\n" +
                                    "Press [2} for NO\n");
                            menuOption = numScanner.nextInt();

                            if(menuOption == 1){
                                anotherPen = true;
                            }

                        } while (anotherPen);

                        break;
                    case 2:
                        System.out.println("Case 2");
                        break;
                    case 3:

                        do {

                            System.out.println("Add Animal to a Pen\n");

                            System.out.println("What is the species of the animal you'd like to add:  ");
                            species = textScanner.nextLine();

                            System.out.println("What is the size of the animal you'd like to add:  ");
                            size = textScanner.nextLine();

                            System.out.println("What is the gender of the animal you'd like to add:  ");
                            gender = textScanner.nextLine();

                            Animal newAnimal = new Animal(species, size, gender);

                            newPen.addAnimalToPen(newAnimal);

                            System.out.println("Would you like to add another animal?\n" +
                                    "Press [1] for YES\n" +
                                    "Press [2} for NO\n");
                            menuOption = numScanner.nextInt();

                            if(menuOption == 1){
                                anotherAnimal = true;
                            }

                        } while (anotherAnimal);

                        break;
                    case 4:

                        do {

                            System.out.println("Add a Baby Animal to a Pen\n");

                            System.out.println("What is the age of the baby animal you'd like to add:  ");
                            age = numScanner.nextInt();

                            System.out.println("What is the species of the baby animal you'd like to add:  ");
                            species = textScanner.nextLine();

                            System.out.println("What is the size of the baby animal you'd like to add:  ");
                            size = textScanner.nextLine();

                            System.out.println("What is the gender of the baby animal you'd like to add:  ");
                            gender = textScanner.nextLine();

                            BabyAnimal newBabyAnimal = new BabyAnimal(age, species, size, gender);

                            newPen.addBabyAnimalToPen(newBabyAnimal);

                            System.out.println("Would you like to add another animal?\n" +
                                    "Press [1] for YES\n" +
                                    "Press [2} for NO\n");
                            menuOption = numScanner.nextInt();

                            if(menuOption == 1){
                                anotherAnimal = true;
                            }

                        } while (anotherAnimal);

                        break;
                    case 5:
                        System.out.println("Case 5");
                        break;
                    case 6:
                        System.out.println("The animals in the Animal Pen are:  \n");
                        break;
                    case 7:
                        System.out.println("Case 6");
                        break;

                }
            }


        } while (keepRunning);
    }
}
