/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

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
        
        ProxyPrinter proxy = new ProxyPrinter();
        
        User user1 = new User();
        user1.isAdmin = true;
        
        
        User user2 = new User();
        
        boolean run = true;
        while(run){
            System.out.println("1: Print using admin\n2: Print Using non admin\nAny other char to exit");
            if(sc.hasNextInt()){
                
                int option = sc.nextInt();
                if(option == 1){
                    System.out.println("Enter message");
                    String message = sc.next();
                    proxy.setCurrentuser(user1);
                    proxy.print(message);
                }else if(option == 2){
                    System.out.println("Enter message");
                    String message = sc.next();
                    proxy.setCurrentuser(user2);
                    proxy.print(message);
                }else
                    run = false;
            } else 
                run = false;
        }
    }    
}
