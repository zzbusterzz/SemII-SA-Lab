/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.Scanner;

/**
 *
 * @author MScIT17
 */
public class Runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        VegRicePlateBuilder vBuilder = new VegRicePlateBuilder();
        NonVegRicePlateBuilder nvBuilder = new NonVegRicePlateBuilder();
        
        Waiter waiter = new Waiter();
        System.out.println("1: Non Veg Rice Plate\n2: Veg Rice Plate\nAny other char to exit");
        
        boolean run = true;
        while(run){
            if(sc.hasNextInt()){
                int option = sc.nextInt();
                
                if(option == 1){
                    waiter.setRicePlateBuilder(nvBuilder);
                    RicePlate rp = waiter.getRicePlate();
                    rp.printDishes();
                    
                }else if(option == 2){
                    waiter.setRicePlateBuilder(vBuilder);
                    RicePlate rp = waiter.getRicePlate();
                    rp.printDishes();
                }else
                    run = false;
            } else 
                run = false;
        }
    }
}
