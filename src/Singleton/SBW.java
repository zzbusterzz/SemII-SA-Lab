/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class SBW {
    private static SBW instance;
    
    private String name = "Swastik Bakery Works";
    private String address = "Quepem Goa";
    private String telephone_Number = "9876543210";
    private String email_ID = "SBW@xyz.com";
    
    private SBW(){
        
    }
    
    public static SBW getInstance(){
        if(instance == null)
            instance = new  SBW();
        return instance;
    }
    
    public void DisplaySBWDetails(){
        System.out.println("Name : " + name + "\n" + "Address : " + address + "\n" + "Telephone Number : "+  telephone_Number + "\n" + "Email ID : " + email_ID);
    }
}
