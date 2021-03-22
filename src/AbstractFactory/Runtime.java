/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Crops.CropsFactory;
import AbstractFactory.Season.Season;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MScIT17
 */
public class Runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProducerFactory factoryGen = new ProducerFactory();
        
        factoryGen.AddSeasonalCrop(Season.SeasonType.Rabi, CropsFactory.CropType.Field, "Rice");
        factoryGen.AddSeasonalCrop(Season.SeasonType.Rabi, CropsFactory.CropType.Field, "Wheat");
        
        factoryGen.AddSeasonalCrop(Season.SeasonType.Khariff, CropsFactory.CropType.Commercial, "Carrot");
        factoryGen.AddSeasonalCrop(Season.SeasonType.Khariff, CropsFactory.CropType.Commercial, "Brinjal");
        factoryGen.AddSeasonalCrop(Season.SeasonType.Khariff, CropsFactory.CropType.Commercial, "Onion");
        
        
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        
        int seasonType = -1;
        while(run)
        {
            seasonType = SelectOption(sc, "Enter Season :\n0:Exit\n1:Khariff\n2:Rabi");
            if(seasonType == 0){
                run = false;
            }
            else if( seasonType == 1 ||  seasonType == 2)
            {
                List<String> crops = null;
                
                Season.SeasonType currentSeason = Season.SeasonType.Rabi;
                CropsFactory.CropType currentCrop = CropsFactory.CropType.Commercial;
                
                boolean runInternal = true; 
                int cropType = -1;
                
                while(runInternal)
                {
                    cropType = SelectOption(sc, "Enter crop Type:\n1:Field\n2:Commercial");
                    if(cropType == 1 || cropType == 2)
                        runInternal = false;
                    else
                        System.out.println("Enter a valid value");
                }
                
                if(seasonType == 1)
                    currentSeason = Season.SeasonType.Khariff;
                
                if(cropType == 1)
                    currentCrop = CropsFactory.CropType.Field;
                
                crops = factoryGen.getSeasonalCrop(currentSeason, currentCrop);
                if(crops == null)
                    System.out.println("No crops");
                else{
                    System.out.println("The following " + currentCrop.name() + " crops for the "+ currentSeason.name() +" season");                    
                    PrintCrops(crops);
                }
            }
            else
                System.out.println("Enter a valid value");
        }
    }
    
    private static int SelectOption(Scanner sc, String message){
        System.out.println(message);
        int value = -1;
        if(sc.hasNextInt()){
            value = sc.nextInt();
        }
        return value;
    }
    
    private static void PrintCrops(List<String> crops){
        for(int i = 0; i < crops.size(); i++){
            System.out.println(crops.get(i));
        }
    }
}