/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class FoodWorks {
    
    public static void main(String[] args) {
        
        SBW instance = SBW.getInstance();
        instance.DisplaySBWDetails();
        
        System.out.println("Instance 1: " + instance.hashCode() + " Instance 2: "+ SBW.getInstance().hashCode());
    }
}
