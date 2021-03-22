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
public class Decorator {

    private ConstructionProject CP;

    public Decorator(ConstructionProject CP) {
        this.CP = CP;
    }

    public void Display() {
        CP.Display();
    }
}
