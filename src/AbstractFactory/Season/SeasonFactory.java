/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Season;

import AbstractFactory.AbstractSeasonCrop;
import AbstractFactory.Crops.Crops;
import AbstractFactory.Crops.CropsFactory;

/**
 *
 * @author MScIT17
 */


public class SeasonFactory extends AbstractSeasonCrop{
    
    @Override
    public Season getSeason(Season.SeasonType season) {
        if(season == Season.SeasonType.Khariff)
            return new KharifSeason(season);
        else
            return new RabiSeason(season);
    }

    @Override
    public Crops getCrops(CropsFactory.CropType cropType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
