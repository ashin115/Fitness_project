package com.company;

import java.io.File;
import java.util.Scanner;

import static java.lang.System.exit;

public  class diet {
    public static byte menuopt;
    public static double BMI;

    public static void main(String[] args) {
        int option = menu();
        dietChooser(option);
    }

    static void recommendation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (in kgs) : ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height (in m ): ");
        double height = sc.nextDouble();
        BMI = weight/(height*height);
        System.out.printf("Your BMI is %.2f", BMI);

        if (BMI < 18.5) {
            System.out.println("\nYou are underweight");
            System.out.println("Recommending a weight gain diet!");
            weightGain();
        } else if (BMI < 24.9) {
            System.out.println("\nYou are in the normal range");
            System.out.println("Recommending a balanced diet!");
            balancedDiet();
        } else if (BMI < 29.9) {
            System.out.println("\nYou are overweight");
            System.out.println("Recommending a weight loss diet!");
            weightLoss();
        } else if (BMI > 30) {
            System.out.println("\nYou are obese");
            System.out.println("Recommending a weight loss diet!");
            weightLoss();
        }
    }

    static void dietChooser(int option) {
        switch (option) {
            case 1 -> weightLoss();
            case 2 -> weightGain();
            case 3 -> balancedDiet();
            case 4 -> recommendation();
        }
    }

    static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSelect a diet from the following list. If you don't know precisely then choose the recommended Diet.");
        System.out.println("1. Weight loss Diet");
        System.out.println("2. Weight gain Diet");
        System.out.println("3. Balanced Diet");
        System.out.println("4. Recommended Diet");
        System.out.print("Your Choice : ");
        try {
            menuopt = sc.nextByte();
            while (menuopt < 1 || menuopt > 4) {
                System.out.println("Choose a valid option : ");
                menuopt = sc.nextByte();
            }
        } catch (Exception e) {
            System.out.println("Error!");
            exit(0);
        }
        return menuopt;
    }

    static void weightLoss(){
        File file = new File("src/com/company/Diet and Workouts/Diets/Weight Loss.txt");
        try {
            Scanner sc1 = new Scanner(file);
            while (sc1.hasNext()) {
                String word = sc1.nextLine();
                System.out.println(word);
            }
        }
        catch(Exception e){
            System.out.println("Error!");
            exit(0);
        }
    }

    static void balancedDiet(){
        File file = new File("src/com/company/Diet and Workouts/Diets/Balanced.txt");
        try {
            Scanner sc1 = new Scanner(file);
            while (sc1.hasNext()) {
                String word = sc1.nextLine();
                System.out.println(word);
            }
        }
        catch(Exception e){
            System.out.println("Error!");
            exit(0);
        }
    }
    static void weightGain(){
        File file = new File("src/com/company/Diet and Workouts/Diets/Weight Gain.txt");
        try {
            Scanner sc1 = new Scanner(file);
            while (sc1.hasNext()) {
                String word = sc1.nextLine();
                System.out.println(word);
            }
        }
        catch(Exception e){
            System.out.println("Error!");
            exit(0);
        }
    }
}
