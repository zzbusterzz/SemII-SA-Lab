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
public class Leasable extends Decorator{
    private String leasee;

    public Leasable(ConstructionProject CP) {
        super(CP);
    }

    public void leaseFlat(String leasee){
        this.leasee = leasee;
    }
    
    @Override
    public void Display(){
        super.Display();
        System.out.println("Leased to " + leasee);
    }
}