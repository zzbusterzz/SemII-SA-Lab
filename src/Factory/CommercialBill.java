/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author MScIT17
 */
public class CommercialBill extends Bill {

    @Override
    public float getBillTotal(int units) {
        return 7.5f * units;
    }
    
}
