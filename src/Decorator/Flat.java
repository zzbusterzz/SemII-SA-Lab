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
public class Flat extends ConstructionProject{
    private int FlatID;
    private int noOfBedrooms;
    private boolean presenceofBalcony;
    
    public Flat(String owner, float area, int FlatID, int noOfBedrooms,boolean presenceofBalcony){
        this.owner = owner;
        this.area = area;
        this.FlatID = FlatID;
        this.noOfBedrooms = noOfBedrooms;
        this.presenceofBalcony = presenceofBalcony;
    }
    
    public int getFlatID() {
        return FlatID;
    }

    public void setFlatID(int FlatID) {
        this.FlatID = FlatID;
    }

    public int getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public void setNoOfBedrooms(int noOfBedrooms) {
        this.noOfBedrooms = noOfBedrooms;
    }

    public boolean isPresenceofBalcony() {
        return presenceofBalcony;
    }

    public void setPresenceofBalcony(boolean presenceofBalcony) {
        this.presenceofBalcony = presenceofBalcony;
    }
    
    @Override
    public void Display() {
        super.Display();
        System.out.println("Flat ID :" + FlatID);
        System.out.println("No of Bedrooms :" + noOfBedrooms);
        System.out.println("Is Balcony Present :" + presenceofBalcony);
    }
}
