/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Crops.CropsFactory;
import AbstractFactory.Crops.*;
import AbstractFactory.Season.*;
import java.util.List;

/**
 *
 * @author MScIT17
 */
public abstract class AbstractSeasonCrop {
    public abstract Season getSeason(Season.SeasonType season);
    public abstract Crops getCrops(CropsFactory.CropType cropType);
}
