/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mserrao.week1;

/**
 * Game of eating apples, carrots, and sushi to see if you can beet Jeffrey the
 * Sumo Wrestler.
 *
 * @author maizi
 */
public class HowMuchCanYouEat {

    // instance variables 
    private int apples;
    private int sushi;
    private int carrots;
    private String name;
    private boolean champion;

    /**
     * Default constructor for HowMuchCanYouEat. Sets apples eaten to 0, sushi
     * eaten to 0, carrots eaten to 0, name champion as false.
     */
    public HowMuchCanYouEat() {
        apples = 0;
        sushi = 0;
        carrots = 0;
        name = "UNKNOWN";
        champion = false;
    }

    /**
     * Constructor that creates a new HowMuchCanYouEatObject
     * @param apples apples eaten
     * @param sushi sushi eaten
     * @param carrots carrots eaten
     * @param name name of the challenger
     * @param champion true if Jeffrey the Sumo Wrestler is beaten
     */
    public HowMuchCanYouEat(int apples, int sushi, int carrots, String name,
            boolean champion) {
        this.apples = apples;
        this.sushi = sushi;
        this.carrots = carrots;
        this.name = name;
        this.champion = champion;
    }

    /**
     * Accessor method stating number of apples eaten.
     * @return number of apples eaten
     */
    public int getApples() {
        return apples;
    }
    
    /**
     * Accessor method stating number of sushi eaten.
     * @return sushi eaten
     */
    public int getSushi() {
        return sushi;
    }

    /**
     * Accessor method stating number of carrots eaten.
     * @return carrots eaten
     */
    public int getCarrots() {
        return carrots;
    }
    
    /**
     * Accessor method stating name of challenger.
     * @return name of challenger
     */
    public String getName() {
        return name;
    }
    
    /**
     * Accessor method that is true if Jeffrey the Sumo Wrestler is beaten.
     * @return true if Jeffrey the sumo wrestler is beaten
     */
    public boolean getChampion() {
        return champion;
    }

    /**
     * Makes challenger throw up apples
     * @param num1 number of apples vomited
     */
    public void vomitApples(int num1) {
        if (num1 <= apples) {
            apples -= num1;
        }
        else throw new IllegalArgumentException("Can't throw up more apples than eaten!");
    }

    /**
     * Makes challenger throw up sushi
     * @param num2 number of pieces of sushi vomited
     */
    public void vomitSushi(int num2) {
        if (num2 <= sushi) {
            sushi -= num2;
        }
    }

    /**
     * Makes challenger throw up carrots
     * @param num3 number of carrots vomited
     */
    public void vomitCarrots(int num3) {
        if (num3 <= carrots) {
            carrots -= num3;
        }
    }

    /**
     * Changes name of challenger
     * @param nam new name of challenger
     */
    public void changeName(String nam) {
        name = nam;
    }
    
    /**
     * Determines the total amount of apples, sushi, and carrots the challenger 
     * has eaten.
     */
    public void determineChampion() {
        if ((apples + carrots + sushi) <= 10) {
            champion = true;
        } else {
            champion = false;
        }
    }

}
