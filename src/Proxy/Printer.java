/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author MScIT17
 */
public class Printer implements Print{

    @Override
    public void print(String message) {
        System.out.println("Printed : " + message);
    }
}
