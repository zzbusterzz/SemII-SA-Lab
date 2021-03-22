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
public class WicketsTaken {
    private int minWicketsRequired = 75;

    public boolean hasEnoughWickets(Player player) {
        if (player.getWicketsTaken() >= minWicketsRequired) {
            return true;
        } else {
            return false;
        }
    }
}
