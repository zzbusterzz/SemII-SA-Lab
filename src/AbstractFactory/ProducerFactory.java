/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Crops.CommercialCrop;
import AbstractFactory.Crops.Crops;
import AbstractFactory.Crops.CropsFactory;
import AbstractFactory.Crops.CropsFactory.CropType;
import AbstractFactory.Crops.FieldCrop;
import AbstractFactory.Season.Season;
import AbstractFactory.Season.Season.SeasonType;
import AbstractFactory.Season.SeasonFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author MScIT17
 */
public class ProducerFactory {
    public enum FactoryType{
        Crop,
        Season
    }
    
    private HashMap<Season, Crops> linkedCrops;
    
    private SeasonFactory seasonFactory;
    private CropsFactory cropFactory;
    
    public ProducerFactory(){
        linkedCrops = new HashMap();
        
        seasonFactory = new SeasonFactory();
        
        cropFactory = new CropsFactory();
    }
    
    public void AddSeasonalCrop(SeasonType season, CropType crop, String cropName){
        Season seasonCurrent = getSeason(season);
        
        if(seasonCurrent == null)
        {
            Crops cropT = cropFactory.getCrops(crop);//Creates insteacse of crop type
            linkedCrops.put(seasonFactory.getSeason(season) , cropT);
            cropT.addCrop(cropName);
        }else
            linkedCrops.get(seasonCurrent).addCrop(cropName);
        
    }
    
    public List<String> getSeasonalCrop(SeasonType season, CropType crop){
        Season seasonCurrent = getSeason(season);
        if(seasonCurrent == null)        
            return null;
        else {
            if( linkedCrops.get(seasonCurrent) instanceof CommercialCrop && crop == CropType.Commercial)
                return linkedCrops.get(seasonCurrent).getCrops();
            else if( linkedCrops.get(seasonCurrent) instanceof FieldCrop && crop == CropType.Field)
                return linkedCrops.get(seasonCurrent).getCrops();
            else return null;
        }
    }
    
    private Season getSeason(SeasonType season){
        if(linkedCrops.size() == 0) return null;
        
        Season seasonCurrent = null;
        for (Map.Entry mapElement : linkedCrops.entrySet()) { 
            seasonCurrent = ((Season) mapElement.getKey());
              if(seasonCurrent.returnSeasonType() == season) 
                 return seasonCurrent;
        }
        
        return null;
    }
}
