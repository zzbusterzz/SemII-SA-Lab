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
public class PlayerSelection {
    private WicketsTaken WT;
    private BoundriesScored BS;
    private RunScored RS;
    
    PlayerSelection(){
        WT = new WicketsTaken();
        BS = new BoundriesScored();
        RS = new RunScored();
    }
    
    public boolean isPlayerFitForSelection(Player player){
        if(WT.hasEnoughWickets(player) || BS.hasEnoughBoundries(player) || RS.hasEnoughRuns(player))
            return true;
        else
            return false;
    }
}
