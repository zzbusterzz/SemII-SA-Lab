/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author 1
 */
public class Runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player p1 = new Player("Virat Kohli",7000, 20, 200 );
        Player p2 = new Player("Mohmad Shami",1000, 250, 15 );
        Player p3 = new Player("New Player",100, 15, 6 );
        
        PlayerSelection plS = new PlayerSelection();
        
        if( plS.isPlayerFitForSelection(p1))
            System.out.println("Player " + p1.getName() + " is suitable for selection" );
        else
            System.out.println("Player " + p1.getName() + " is not suitable for selection" );
            
        if( plS.isPlayerFitForSelection(p2))
            System.out.println("Player " + p2.getName() + " is suitable for selection" );
        else
            System.out.println("Player " + p2.getName() + " is not suitable for selection" );
        
        if( plS.isPlayerFitForSelection(p3))
            System.out.println("Player " + p3.getName() + " is suitable for selection" );
        else
            System.out.println("Player " + p3.getName() + " is not suitable for selection" );
    }
}
