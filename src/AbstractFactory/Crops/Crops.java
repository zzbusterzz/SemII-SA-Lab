/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Crops;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MScIT17
 */
public abstract class Crops {
    List<String> cropNames;
    
    public Crops()
    {
        cropNames = new ArrayList() {};
    }
    
    public abstract void addCrop(String cropName);
    
    public abstract List<String> getCrops();
}
