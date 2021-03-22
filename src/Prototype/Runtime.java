/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MScIT17
 */
public class Runtime {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scooter scooter = new Scooter();
        Seden seden = new Seden();
        
        try {
            PrototypeGenerator prototypeGenerator = new PrototypeGenerator(seden, scooter);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Runtime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
