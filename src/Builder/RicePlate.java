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
public class RicePlate {
    String dish1;
    String dish2;
    String dish3;
    String dish4;
    String dish5;
    String dish6;
    
    String dessert;
    String drink;
    
    public void setDishes(  String dish1,String dish2,String dish3,
                            String dish4,String dish5,String dish6){
        this.dish1 = dish1;
        this.dish2 = dish2;
        this.dish3 = dish3;
        this.dish4 = dish4;
        this.dish5 = dish5;
        this.dish6 = dish6;
        
    }
    
    public void setDessert(  String dessert){
        this.dessert = dessert;
        
    }
        
    public void setDrink(  String drink){
        this.drink = drink;        
    }
    
    public void printDishes(){
        System.out.println("Dishes : " + dish1 + "," + dish2 + "," +dish3 + "," +dish4 + "," +dish5 + "," +dish6);
        System.out.println("Drink : " + drink );
        System.out.println("Dessert : " + dessert );
    }
}
