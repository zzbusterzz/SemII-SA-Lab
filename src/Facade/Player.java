/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author 1
 */
public class Player {
    private String name;
    private int runsScored = 0;
    private int wicketsTaken = 0;
    private int boundriesScored = 0;
    
    Player(String name, int runsScored, int wicketsTaken, int boundriesScored){
        this.name = name;
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
        this.boundriesScored = boundriesScored;
    }
     
    public int getRunsScored() {
        return runsScored;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public int getBoundriesScored() {
        return boundriesScored;
    }
    
    public String getName() {
        return name;
    }
    
    public Player(String name){
        this.name = name;
    }
}
