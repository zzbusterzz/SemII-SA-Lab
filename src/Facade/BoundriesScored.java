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
public class BoundriesScored {
    private int minBoundriesRequired = 25;

    public boolean hasEnoughBoundries(Player player) {
        if (player.getBoundriesScored()>= minBoundriesRequired) {
            return true;
        } else {
            return false;
        }
    }
}
