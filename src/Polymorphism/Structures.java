/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

import java.util.Scanner;


/**
 *
 * @author MScIT17
 */
public class Structures {

    private Scanner scanner; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Structures struct = new Structures();
        struct.DisplayOptions();
    }
    
    private void DisplayOptions(){
        MyStack stack = new MyStack();
        MyQueue queue = new MyQueue();
        
        scanner = new Scanner(System.in);
        
        System.out.println("Select 1 - stack or 2 - queue operation, character to exit");
        
        boolean run = true;
        while(run){
            if(scanner.hasNextInt()){                
                switch(scanner.nextInt()){
                    case 1:
                        System.out.println("Stack Selected");
                        Operations(stack);
                        break;
                        
                    case 2:
                        System.out.println("Queue Selected");
                        Operations(queue);
                        break;
                        
                    default:
                        run = false;
                }
            }
            else{
                scanner.next();
                run = false;
                scanner.close();
            }
        }
    }
    
    public void Operations(MyInterface interFace){
        int value;
        boolean runInternal = true;
        while(runInternal){
            System.out.println("Enter \n1: Insert(Positive No only)\n2: Delete\n3: Peek\n4: Display");
            if(scanner.hasNextInt()){
                switch(scanner.nextInt()){
                    case 1:
                        if(scanner.hasNextInt()){
                            value = scanner.nextInt();
                            if(value >= 0)//Takes only postive
                                interFace.insert(value);
                        }
                        break;

                    case 2:
                        value = interFace.delete();
                        if(value != -1)
                            System.out.println("Removed value " + value);
                        else
                            System.out.println("Underflow");
                        break;

                    case 3:
                        value = interFace.peek();
                        if(value != -1)
                            System.out.println("Value at the end " + value);
                        else
                            System.out.println("Empty");

                        break;

                    case 4:
                        interFace.display();
                        break;

                    default:
                        runInternal = false;
                }
            }
            else
                runInternal = false;
        }    
    }
}