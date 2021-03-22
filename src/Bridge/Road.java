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
public abstract class Road {
    float currentMileage = 0;
    public abstract void setMileage(int mileage);
    public abstract void displayMileage();
}
