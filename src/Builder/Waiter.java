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
public class Waiter {
    RicePlateBuilder rpb;
    
    void setRicePlateBuilder(RicePlateBuilder rpb){
        this.rpb = rpb;
    }
    
    RicePlate getRicePlate(){
        ConstructRicePlate();
        return rpb.getRicePlate();
    }
    
    void ConstructRicePlate(){
        rpb.createRicePlate();
    }
}
