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
public class ProxyPrinter implements Print{
    
    private User currentUser;
    private Printer currentPrinter;
    
    ProxyPrinter(){
        currentPrinter = new Printer();
    }
    
    public void setCurrentuser(User user){
        currentUser = user;
    }
    
    @Override
    public void print(String message) {
        if(currentUser.isAdmin)
            currentPrinter.print(message);
        else
            System.out.println("You are not allowed to print");
    }
    
}
