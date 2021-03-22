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
public abstract class MarutiCar {
    int noOfSeats;
    int year;
    
    CityRoad cityRoad;
    Highway highway;
    
    public abstract void displayMileage();
}
