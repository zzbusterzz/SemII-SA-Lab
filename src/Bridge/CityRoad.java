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
public class CityRoad extends Road{
    
    @Override
    public void displayMileage() {
        System.out.println("City Mileage is :" + this.currentMileage);
    }

    @Override
    public void setMileage(int mileage) {
        this.currentMileage = mileage;
    }
}
