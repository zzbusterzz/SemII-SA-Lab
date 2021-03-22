/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Season;

/**
 *
 * @author MScIT17
 */
public abstract class Season {
    
    public enum SeasonType{
        Khariff,
        Rabi
    }
    
    private SeasonType currentSeason;
    
    public Season(SeasonType seasonType){
        currentSeason = seasonType;
    }
    
    public SeasonType returnSeasonType(){
        return currentSeason;
    }
}
