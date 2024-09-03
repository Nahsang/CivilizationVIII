package com.GroupProject.controller;

import com.GroupProject.models.FireVillage;
import com.GroupProject.models.UserRegistration;
import com.GroupProject.models.WaterVillage;

import java.util.Locale;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {

//player_id, question_id, answer_id
        Scanner scan = new Scanner(System.in);
        System.out.println("----- Welcome to civilizationVII game -----");
        System.out.println("--------------------------------------------");
        System.out.println("Hello villager whats your name ");
        String name = scan.nextLine();
        System.out.println(name);

        System.out.println("good day " + name + " hit enter to continue");
        scan.nextLine();
        System.out.println("before i can allow you to continue lets find a good place for you" + " hit enter to continue");
        scan.nextLine();
        System.out.println("i will ask you a few questions to determine where you'd fit best " + " hit enter to continue");
        scan.nextLine();
        System.out.println("Are you ready");
        System.out.println(" Y/N");

        String readyResponse = scan.nextLine().toLowerCase();


        if (readyResponse.equals("y") || readyResponse.equals("true")) {

            System.out.println("When faced with a challenge, I tend to:");
            System.out.println("A. Seek advice from tradition and follow established methods.");
            System.out.println("B. Reflect on the situation, seeking deeper meaning or spiritual guidance.");
            System.out.println("C. Tune into my emotions and trust my intuition to guide me.");
            System.out.println("D. Act quickly and decisively, following my instincts.");
            System.out.print("Please enter your choice (A/B/C/D): ");

            String choice = scan.nextLine().toUpperCase();
            scan.nextLine();

            System.out.println("My ideal way of spending a free day is:");
            System.out.println("A. Working on a project or maintaining something that brings stability to my life.");
            System.out.println("B. Meditating, exploring nature, or engaging in spiritual practices.");
            System.out.println("C. Connecting with others on an emotional level or expressing my feelings through art.");
            System.out.println("D. Seeking excitement, adventure, or new experiences.");
            System.out.print("Please enter your choice (A/B/C/D): ");

            String choice1 = scan.nextLine().toUpperCase();
            scan.nextLine();

            System.out.println("When making a decision, I usually:");
            System.out.println("A. Consider the tried-and-true methods and what has worked in the past.");
            System.out.println("B. Think about how it aligns with my higher purpose or values.");
            System.out.println("C. Rely on my gut feeling or the emotions of those involved.");
            System.out.println("D. Make a quick decision and deal with the consequences later.");
            System.out.print("Please enter your choice (A/B/C/D): ");


            String choice2 = scan.nextLine().toUpperCase();
            scan.nextLine();


            System.out.println("My friends would describe me as:");
            System.out.println("A. Consider the tried-and-true methods and what has worked in the past.");
            System.out.println("B. Think about how it aligns with my higher purpose or values.");
            System.out.println("C. Rely on my gut feeling or the emotions of those involved.");
            System.out.println("D. Make a quick decision and deal with the consequences later.");
            System.out.print("Please enter your choice (A/B/C/D): ");

            String choice3 = scan.nextLine().toUpperCase();
            scan.nextLine();

            System.out.println("In a group setting, I am most likely to:");
            System.out.println("A. Take on a steady role, ensuring that everything runs smoothly.");
            System.out.println("B. Offer insights or encourage others to think deeply.");
            System.out.println("C. Sense the mood of the group and act to keep harmony.");
            System.out.println("D. Lead the charge or push the group toward action.");
            System.out.print("Enter your choice (A/B/C/D): ");

            String choice4 = scan.nextLine().toUpperCase();
            scan.nextLine();

            System.out.println("When faced with conflict, my first instinct is to:");
            System.out.println("A. Try to find a practical solution that maintains stability.");
            System.out.println("B. Seek understanding and see the bigger picture beyond the immediate issue.");
            System.out.println("C. Address the emotional needs of everyone involved to resolve tension.");
            System.out.println("D. Confront the issue head-on and resolve it as quickly as possible.");
            System.out.print("Enter your choice (A/B/C/D): ");

            String choice5 = scan.nextLine().toUpperCase();
            scan.nextLine();

            System.out.println("I feel most at peace when I am:");
            System.out.println("A. Grounded in my routines and responsibilities.");
            System.out.println("B. In tune with my spiritual side or connected to nature.");
            System.out.println("C. In touch with my emotions or helping others with theirs.");
            System.out.println("D. In the middle of action, taking charge of my circumstances.");
            System.out.print("Enter your choice (A/B/C/D): ");

            String choice6 = scan.nextLine().toUpperCase();
            scan.nextLine();

        }if(readyResponse.equals("n") || readyResponse.equals("false")){

            System.out.println("you can exit the game" + name);
        }


    }


}