/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author 1
 */
public class Shop extends ConstructionProject{
    private int shopId;
    
    public Shop(String owner, float area, int shopId){
        this.owner = owner;
        this.area = area;
        this.shopId = shopId;
    }
    
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
    
    @Override
    public void Display() {        
        super.Display();
        System.out.println("Shop ID :" + shopId);
    }
    
}
