/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author MScIT17
 */
public class Maruti800 extends MarutiCar{
   
    Maruti800(){
        this.noOfSeats = 5;
        this.year = 2000;
        
        highway = new Highway();
        highway.setMileage(17);
        
        cityRoad = new CityRoad();
        cityRoad.setMileage(14);
    }
    
    @Override
    public void displayMileage() {
        highway.displayMileage();
        cityRoad.displayMileage();
    }
    
}
