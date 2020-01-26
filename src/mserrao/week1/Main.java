/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mserrao.week1;

import java.util.Scanner;

/**
 * Game of eating apples, carrots, and sushi to see if you can beet Jeffrey the Sumo Wrestler.
 * @author maizi
 */
public class Main {

    public static void main(String[] args) {

        String cont;
        do {
            HowMuchCanYouEat sumoWrestler = new HowMuchCanYouEat(5, 20, 5, "Jeffrey", true);
           
            System.out.print("Hello, challenger! What is your name?\n");
            Scanner scan1 = new Scanner(System.in);
            String newDudeName = scan1.nextLine();

            System.out.println("\nHow many apples can you eat?");
            int newDudeApples = scan1.nextInt();

            System.out.println("\nHow many pieces of sushi can you eat?");
            int newDudeSushi = scan1.nextInt();

            System.out.println("\nHow many carrots can you eat?");
            int newDudeCarrots = scan1.nextInt();

            System.out.println("\nDid you beat Jeffrey the Sumo Wrestler?");
            boolean newDudeChampion = false;
            int newDudeTotal = newDudeApples + newDudeSushi + newDudeCarrots;
            if ((newDudeTotal) > 30) {
                newDudeChampion = true;
                System.out.println("Yeah! You can eat more than a pro!");
            } else {
                System.out.println("Sorry buddy, you didn't.");
            }

            HowMuchCanYouEat newDude = new HowMuchCanYouEat(newDudeApples, newDudeSushi, newDudeCarrots, newDudeName, newDudeChampion);

            sumoWrestler.vomitApples(1);
            sumoWrestler.vomitSushi(3);
            sumoWrestler.vomitCarrots(1);
            System.out.println("\nOh, wait! Jeffrey threw up! Did you throw up too? (yes/no)");

            boolean newDudeVomit;
            String newDudeThrewUp = scan1.next();

            int newDudeApplesThrownUp, newDudeSushiThrownUp, newDudeCarrotsThrownUp;

            if (newDudeThrewUp.equals("yes") || (newDudeThrewUp.equals("Yes"))) {
                System.out.println("\nHow many apples did you throw up?");
                newDudeApplesThrownUp = scan1.nextInt();
                newDude.vomitApples(newDudeApplesThrownUp);

                System.out.println("\nHow many pieces of sushi did you throw up?");
                newDudeSushiThrownUp = scan1.nextInt();
                newDude.vomitSushi(newDudeSushiThrownUp);

                System.out.println("\nHow many carrots did you throw up?");
                newDudeCarrotsThrownUp = scan1.nextInt();
                newDude.vomitCarrots(newDudeCarrotsThrownUp);
            }

            System.out.println("\nIs Jeffrey the Sumo Wrestler beaten?");
            if (newDudeTotal > 25) {
                System.out.println("Yeah, you're champion! Put your skills to use and become a sumo wrestler!");
            } else {
                System.out.println("Sorry, it's still a no. Better luck next time!");
            }

            System.out.println("\nDo you want to play again? (Click 1 to continue)");
            cont = scan1.next();
            System.out.println();

        } while (cont.equals("1"));

        System.out.println("Thanks for playing!");
        
            
        }
    }


