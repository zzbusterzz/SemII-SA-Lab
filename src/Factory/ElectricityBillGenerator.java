/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.util.Scanner;

/**
 *
 * @author MScIT17
 */
public class ElectricityBillGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        boolean run = true;
        
        ElectricityFactory ElectricityFactory_Instance = new ElectricityFactory();
        
        while(run){
            System.out.println("Enter bill type \n1: Domestic \n2: Institutional \n3: Commerical");
            if(scan.hasNextInt()){
                int BillType = scan.nextInt();
                System.out.println("Enter the units");
                if(scan.hasNextInt()){
                    int units = scan.nextInt();                   
                    ElectricityFactory_Instance.GenerateElectricityBill(BillType, units);
                } else{
                    run = false;
                    System.out.print("Exiting program\n");
                }
            } else{
                run = false;
                System.out.print("Exiting program\n");
            }        
        }      
    }    
}
