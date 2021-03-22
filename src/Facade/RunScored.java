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
public class RunScored {

    private int minRunsRequired = 2000;

    public boolean hasEnoughRuns(Player player) {
        if (player.getRunsScored() >= minRunsRequired) {
            return true;
        } else {
            return false;
        }
    }
}
