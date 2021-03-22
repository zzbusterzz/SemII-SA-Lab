/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Crops;

import AbstractFactory.AbstractSeasonCrop;
import AbstractFactory.Season.Season;

/**
 *
 * @author MScIT17
 */


public class CropsFactory extends AbstractSeasonCrop{
    
    @Override
    public Crops getCrops(CropType cropType) {
        if(cropType == CropType.Commercial)
            return new CommercialCrop();
        else
            return new FieldCrop();
    }

    @Override
    public Season getSeason(Season.SeasonType season) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum CropType {
        Commercial,
        Field;
    }
}
