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
public abstract class ConstructionProject {
    protected String owner;
    protected float area;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
    
    public void Display(){
        System.out.println("Owner is :" + owner);
        System.out.println("Area is :" + area);
    }
}
