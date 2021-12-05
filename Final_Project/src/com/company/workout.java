package com.company;

import java.io.File;
import java.util.Scanner;
import static java.lang.System.exit;

public class workout{
    public static void main(String[] args){
        menu();
    }

    static void menu(){
        int option=0;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Basic Plans : ");
        System.out.println("1.Cardio");
        System.out.println("2.Body Building");
        System.out.println("3.Yoga");
        System.out.println();
        System.out.print("Your Choice : ");
        try {
            option = sc.nextInt();
            while (option < 1 || option > 3){
                System.out.println("Choose a valid option : ");
                option = sc.nextInt();
            }
        }
        catch (Exception e){
            System.out.println("Error!");
            exit(0);
        }

        switch(option){
            case 1->cardio();
            case 2-> bodyBuilding();
            case 3-> yoga();
        }
    }
    static void cardio() {
        File file = new File("src/com/company/Diet and Workouts/Workouts/Cardio.txt");
        try {
            Scanner sc1 = new Scanner(file);
            while (sc1.hasNext()) {
                String word = sc1.nextLine();
                System.out.println(word);
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }

    static void bodyBuilding(){
        File file = new File("src/com/company/Diet and Workouts/Workouts/Body building.txt");
        try {
            Scanner sc1 = new Scanner(file);
            while (sc1.hasNext()) {
                String word = sc1.nextLine();
                System.out.println(word);
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    static void yoga(){
        File file = new File("src/com/company/Diet and Workouts/Workouts/Yoga.txt");
        try {
            Scanner sc1 = new Scanner(file);
            while (sc1.hasNext()) {
                String word = sc1.nextLine();
                System.out.println(word);
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }

}