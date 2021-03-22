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
public class Runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Flat flat1 = new Flat("Owner1",200, 666, 3, true);
        Flat flat2 = new Flat("Owner2",400, 420, 2, false);
        
        Shop shop1 = new Shop("Shop1",40, 333);
        
        Leasable leased = new Leasable(flat1);
        leased.leaseFlat("SomeUser1");
        leased.Display();
        System.out.println();
        
        Leasable leased2 = new Leasable(shop1);
        leased2.leaseFlat("SomeUser2");
        leased2.Display();
        System.out.println();
        
        flat1.Display();
        System.out.println();
        
        flat2.Display();
        System.out.println();
        
        shop1.Display();
        System.out.println();
    }
    
}
