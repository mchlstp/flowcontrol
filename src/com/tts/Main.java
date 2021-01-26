package com.tts;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printNumbers();
        printUpperCaseLetters();
        printLowerCaseLetters();
        String myName = setMyName();
        boolean moveOn = letsContinue();
        System.out.println("Awesome " + myName);
    }

//ASCII is a 7-bit character set containing 128 characters. It contains the numbers from 0-9, the upper and lower case English letters from A to Z, and some special characters.
//  0-9
   public static void printNumbers() {
//        for(int i = 0; i < 10; i++)
        for(int i = '0';  i <=  '9'; i++)
       System.out.println(i);

    }
//65 - 90
    public static void printUpperCaseLetters() {
        for(int i = 'A';  i <=  'Z'; i++)
            System.out.println(i);

    }

//97 to 122
    public static void printLowerCaseLetters() {
        for(int i = 'a';  i <=  'z'; i++)
            System.out.println(i);

    }

    public static String setMyName() {



        Scanner myName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter your name:");
        String name = myName.nextLine();
        System.out.println(name + " Have a great day!");
        return name;
    }

    public static boolean letsContinue() {



         // Create a Scanner object
        Scanner goOn = new Scanner(System.in);
        System.out.println("Would you like to continue?:");


        String name = goOn.nextLine();

        if (name.equals ("yes")) {
            System.out.println(name + "  Great! Let's continue!");
            return true;
        }else {
                System.out.println(name + " Please return later to complete the survey.");
                return false;
            }
        }

    }


















////single line comment
///*
//*
//* Multi line comment
//*
//*
//*
//*
//* */
////Below is a class
////it is the blueprint for objects in java
////everything in java is in a class
//public class Main {
////below is my main maethod
////    this serves as my entry point
////    my interpreter will look for this method to have acces to my PROGRAM
//    private static int myInt = 4;
//    public int myOtherInt = 5;
//public static void main(String[] args) {
//	System.out.println("Hello World");
//    System.out.println(myInt);
////Main() is calling the contructor which gives us a new instance
//    Main myMain = new Main();
////    below is a function of java, but we will call it a method moving forward
////    strictly speaking - methods are functions that live on objects
//    System.out.println(myMain.myOtherInt);
//    }
//}
