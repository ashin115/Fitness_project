package com.company;

import java.util.Scanner;
import static java.lang.System.exit;

class Customer{
    Scanner sc = new Scanner(System.in);
    public String name,email;              //
    private String pswd;                   //
    public char gender;                    //
    public byte age;                       // Variables
    public int option;                     //
    double height, weight, BMI;            //

    public String getPswd() {
        return this.pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    Customer(){
        System.out.print("\nChoose One Of The Following:\n0. Exit\n1. Login\n2. SignUp\nYour Choice : ");    //Shows Login/SignUp Page
        try {
            option = sc.nextInt();
            while (option < 0 || option > 2) {
                System.out.print("Enter a valid Input : ");
                option = sc.nextInt();
            }
        }
        catch (Exception e){
            System.out.println("Error!");
            exit(0);
        }

        switch (option){
            case 1 -> login();
            case 2 -> signUp();
            case 0 -> quit();
        }
    }

    //SignUp method implementation

    public void signUp() {
        System.out.print("\nEnter your name: ");           // |
        this.name = sc.nextLine();                         // |
        sc.nextLine();                                     // |
        System.out.print("Enter your email-ID : ");        // |
        this.email = sc.nextLine();                        //  } Takes your sign-up details
        System.out.print("Create a password: ");           // |
        this.pswd = sc.nextLine();                         // |
        System.out.print("Confirm password: ");            // |
        String pswd1 = sc.nextLine();                      // |

        //Password Checker

        while (!pswd.equals(pswd1)){
            System.out.println("The passwords entered do not match. Please try again!");
            System.out.print("Create a password: ");
            this.pswd = sc.nextLine();
            System.out.print("Confirm password: ");
            pswd1 = sc.nextLine();
        }

        System.out.println("You account was created successfully!\n");

        // Takes your BioData

        System.out.print("Enter your Age (between 13 and 85 only) : ");
        try {
            age = sc.nextByte();
            while (age < 13 || age > 85) {
                System.out.print("Enter your Age (between 13 and 85 only) : ");
                age = sc.nextByte();
            }
        }
        catch (Exception e){
            System.out.println("Error!");
            exit(0);
        }

        System.out.print("Enter your Gender (M or F) : ");
        gender = sc.next().charAt(0);
        while (gender != 'M' && gender != 'F'){
            System.out.print("Enter your Gender (M or F) : ");
            gender = sc.next().charAt(0);
        }
    }

    //Login method implementation

    public void login() {
        System.out.print("\nEnter your registered email-ID: ");         // |
        this.email = sc.nextLine();                                     // |
        sc.nextLine();                                                  //  } Takes your login details
        System.out.print("Enter your password : ");                     // |
        this.pswd = sc.nextLine();                                      // |
    }

    //Quit method implementation

    public void quit() {
        System.out.println("\nThank you And Have A Wonderful Day Ahead!!");
        exit(0);
    }

    public void display(){
        System.out.print("\nChoose One of the following:\n0. Exit\n1. Calculate BMI\n2. Gain Weight\n3. Reduce Weight\n4. Body Building\n5. Cardio\n6. Yoga\nYour Choice : ");  //Shows menu
        try {
            option = sc.nextInt();
            while (option < 0 || option > 6) {
                System.out.print("Enter a valid Input : ");
                option = sc.nextInt();
            }
        }
        catch (Exception e){
            System.out.println("Error!");
            exit(0);
        }

        switch (option) {
            case 1 -> calculateBMI();
            case 2 -> gainWeight();
            case 3 -> reduceWeight();
            case 4 -> Body_Building();
            case 5 -> Cardio();
            case 6 -> Yoga();
            case 0 -> quit();
        }
    }

    // creating menu //

    public void calculateBMI() {
        System.out.print("\nEnter your Height in m and cms : ");
        height = sc.nextDouble();
        System.out.print("Enter your Weight in kgs and gms : ");
        weight = sc.nextDouble();
        BMI = weight/(height * height);
        System.out.printf("Your BMI : %.2f\n", BMI);
    }

    static public void gainWeight() {
        System.out.println("\nHere are some tips to gain weight ");
        System.out.println("1) Eat More Calories Than Your Body Burns");
        System.out.println("2) Eat Plenty of Protein");
        System.out.println("3) Fill up on Plenty of Carbs and Fat and Eat at Least 3 Times per Day");
        System.out.println("4) Eat Energy-Dense Foods and Use Sauces, Spices and Condiments");
        System.out.println("5) Lift Heavy Weights and Improve Your Strength");
    }

    static public void reduceWeight() {
        System.out.println("\nHere are some tips to lose weight ");
        System.out.println("1) Do not skip breakfast");
        System.out.println("2) Eat regular meals");
        System.out.println("3) Eat plenty of fruit and veg");
        System.out.println("4) Eat high fibre foods");
        System.out.println("5) Trying intermittent fasting");
    }

    static public void Body_Building() {
        System.out.println("\nHere are some tips for body building");
        System.out.println("1) Focus On Lifting More Weight Over Time");
        System.out.println("2) Go One Rep Short Of Failure");
        System.out.println("3) Only Perform Exercises That Work At Least Two Muscle Groups At Once");
        System.out.println("4) Fuel Your Body Right Before And After The Workout");
        System.out.println("5) Never Go More Than Two Weeks Without A Change");
    }

    static public void Cardio() {
        System.out.println("\nhere are some tips for cardio");
        System.out.println("1) Do cardio on an empty stomach");
        System.out.println("2) Consistency is the key");
        System.out.println("3) Hands Free");
        System.out.println("4)  Gradually add speed");
        System.out.println("5) Add more resistance");
    }

    static public void Yoga() {
        System.out.println("\nBest yoga aasanas");
        System.out.println("These 10 poses every day in the morning will give you a great start");
        System.out.println("1) Naukasana");
        System.out.println("2) Paschimottanasana");
        System.out.println("3) Ardha matsyendrasan");
        System.out.println("4) Dandasana");
        System.out.println("5) Viparita Karni");
    }
    // ending menu //
}

// Driver class
public class Main {

    //Basic instructions about the programs

    static void instruction() {
        System.out.println("\nThis Software Will Give You The Best Possible Fitness Schedule For Your Any Kind Of Preferred Scheme. Either Login Or SignUp And Take Advantage Of This Free To Use Software!.");
        System.out.println("There Are 3 Types Of Level For Most Of The Options - Beginner, Intermediate And Advanced.");
        System.out.println("Beginner - (Takes More Amount Of Time In Terms Of Days And Less In Terms Of Hours Per Day) 60 Days plan with relatively less hard work and less hardships.");
        System.out.println("Intermediate - (Takes Fair Amount Of Time In Terms Of Days And Hours Per Day) 45 Days plan with normal hard work and hardships.");
        System.out.println("Advanced - (Takes Less Amount Of Time In Terms Of Days and More In Terms Of Hours Per Day) 30 Days plan with relatively more hard work and more hardships.");
        System.out.println("The Details Of Each Option Are Given Below...");
        System.out.println("1. Calculate BMI : Enter Your Height, Weight, Age and Gender to get your BMI value and find out whether you are underweight, normal weight, overweight or obese.");
        System.out.println("2. Gain Weight : Enter your preferred weight and level (Beginner, intermediate or advanced) and get the time dependent diet-plan accordingly.");
        System.out.println("3. Reduce Weight : Enter your preferred weight and level (Beginner, intermediate or advanced) and get the time dependent exercise and diet-plan accordingly.");
        System.out.println("4. Body_Building : Enter Your Preferred Type Of Body (Muscular Type - A,B,C or D) and level (Beginner, intermediate or advanced) and get the time dependent exercise and diet-plan accordingly.");
        System.out.println("5. Cardio : To Improve Strength, Speed, Agility And Endurance - Enter your preferred level (Beginner, intermediate or advanced) and get the time dependent exercise and diet-plan accordingly.");
        System.out.println("6. Yoga : Doesn't Matter Who You Are, Where You Live, What You Do Or Not.........Yoga Is For Everyone. Start Rejuvenating and Feel Healthier And Happier From Day 1. Get time dependent aerobic and anaerobic exercises accordingly.");
    }

    public static void main(String[] args) {
        Customer[] user = new Customer[10];
        int count = 0, option;
        user[count] = new Customer();
        Scanner sc = new Scanner(System.in);

        // Introductory note starting after the Signup/Login
        instruction();

        // After the Intro ends
        System.out.println("\nWould you like some Healthy Tips Or Calculate Your BMI??");
        System.out.print("Enter 1 for yes and 2 for No : ");
        try {
            option = sc.nextInt();
            while (option < 1 || option > 2) {
                System.out.print("Choose a valid Input : ");
                option = sc.nextInt();
            }
            if (option == 1) {
                user[count].display();
            }
        }
        catch (Exception e){
            System.out.println("Error!");
            exit(0);
        }

        // Choosing Between Diet plan and Workout Plan
        System.out.println("\nChoose one from the following: ");
        System.out.print("0. Exit\n1. Diet Plan\n2. Workout Plan\nYour Choice : ");

        try {
            option = sc.nextInt();
            while (option < 0 || option > 2) {
                System.out.print("Choose a valid Input : ");
                option = sc.nextInt();
            }
            switch (option) {
               //case 1 -> diet.main();
               //case 2 -> workout.main();
               case 0 -> user[count].quit();
            }
        }
        catch (Exception e){
            System.out.println("Error!");
            exit(0);
        }
    }
}