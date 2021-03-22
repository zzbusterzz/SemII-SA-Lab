/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Crops;

import java.util.List;

/**
 *
 * @author MScIT17
 */
public class CommercialCrop extends Crops{

    @Override
    public List<String> getCrops() {
        return cropNames;
    }

    @Override
    public void addCrop(String cropName){
        cropNames.add(cropName);
    }
}
