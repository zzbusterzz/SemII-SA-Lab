/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author MScIT17
 */
public class RicePlateBuilder {
    String dish1;
    String dish2;
    String dish3;
    String dish4;
    String dish5;
    String dish6;
    
    String dessert;
    String drink;
    
    RicePlate currentRicePlate = null;
    
    public RicePlate getRicePlate(){
        return currentRicePlate;
    }
    
    void createRicePlate(){
        currentRicePlate = new RicePlate();
        makeDishes();
        makeDessert();
        makeDrink();
    }
    
    void makeDishes(){
        currentRicePlate.setDishes(dish1,dish2,dish3,dish4,dish5,dish6);
    }
    
    void makeDessert(){
         currentRicePlate.setDessert(dessert);
    }
    
    void makeDrink(){
         currentRicePlate.setDrink(drink);
    }
}
