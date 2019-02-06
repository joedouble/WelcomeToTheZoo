package com.company;

import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {

        Scanner numScanner = new Scanner(System.in);
        int menuOption = 0;
        boolean keepRunning = false;

        do {
            System.out.println("Welcome to the new Detroit Zoo.\n" +
                    "What would you like to do today?\n\n" +
                    "Press [1] to SET UP NEW PENS\n" +
                    "Press [2] to REMOVE PENS\n" +
                    "Press [3] to ADD AN ANIMAL TO A PEN\n" +
                    "Press [4] to ADD A BABY ANIMAL TO A PEN\n" +
                    "Press [5] to REMOVE ANIMALS AND BABY ANIMALS FROM PENS\n" +
                    "Press [6] to DISPLAY ALL THE ANIMALS IN A PEN\n" +
                    "Press [7] to DISPLAY ALL THE ANIMALS IN THE ZOO\n");
            menuOption = numScanner.nextInt();
            keepRunning = false;

            if (menuOption < 1 || menuOption > 4){
                System.out.println("Sorry.  That selection didn't work.  Please try again.\n");
                keepRunning = true;

            } else {

                switch (menuOption) {

                    case 1:
                        System.out.println("Case 1");
                        break;
                    case 2:
                        System.out.println("Case 2");
                        break;
                    case 3:
                        System.out.println("Case 3");
                        break;
                    case 4:
                        System.out.println("Case 4");
                        break;
                    case 5:
                        System.out.println("Case 5");
                        break;
                    case 6:
                        System.out.println("Case 5");
                        break;
                    case 7:
                        System.out.println("Case 6");
                        break;

                }
            }


        } while (keepRunning);
    }
}
