/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author 1
 */
public class Runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Employee emp_Principal = new Employee();
        emp_Principal.setDesignation("Principal");
        emp_Principal.setSalary(50000);
        
        Employee emp_VPrincipal_Arts = new Employee();
        emp_VPrincipal_Arts.setDesignation("Vice Principal Arts");
        emp_VPrincipal_Arts.setSalary(40000);
        
        Employee emp_VPrincipal_Science = new Employee();
        emp_VPrincipal_Science.setDesignation("Vice Principal Science");
        emp_VPrincipal_Science.setSalary(41000);
        
        Employee emp_HOD_Phy = new Employee();
        emp_HOD_Phy.setDesignation("HOD Physics");
        emp_HOD_Phy.setSalary(30000);
        
        Employee emp_HOD_Chem = new Employee();
        emp_HOD_Chem.setDesignation("HOD Chemistry");
        emp_HOD_Chem.setSalary(30000);
        
        Employee emp_HOD_Bio = new Employee();
        emp_HOD_Bio.setDesignation("HOD Biology");
        emp_HOD_Bio.setSalary(30000); 
        
        emp_VPrincipal_Science.setSubEmp(emp_HOD_Phy);
        emp_VPrincipal_Science.setSubEmp(emp_HOD_Chem);
        emp_VPrincipal_Science.setSubEmp(emp_HOD_Bio);
        
        Employee emp_HOD_Phil = new Employee();
        emp_HOD_Phil.setDesignation("HOD Philosophy");
        emp_HOD_Phil.setSalary(29000);
        
        Employee emp_HOD_Sociology = new Employee();
        emp_HOD_Sociology.setDesignation("HOD Sociology");
        emp_HOD_Sociology.setSalary(29000);
        
        Employee emp_HOD_Logic = new Employee();
        emp_HOD_Logic.setDesignation("HOD Logic");
        emp_HOD_Logic.setSalary(29000); 
        
        emp_VPrincipal_Arts.setSubEmp(emp_HOD_Phil);
        emp_VPrincipal_Arts.setSubEmp(emp_HOD_Sociology);
        emp_VPrincipal_Arts.setSubEmp(emp_HOD_Logic);
        
        emp_Principal.setSubEmp(emp_VPrincipal_Arts);
        emp_Principal.setSubEmp(emp_VPrincipal_Science);
        
        
        System.out.println("CTC of Principal is " + emp_Principal.getCTC());
        
        System.out.println("CTC of VP of Science is " + emp_VPrincipal_Science.getCTC());
        System.out.println("CTC of VP of Arts is " + emp_VPrincipal_Arts.getCTC());
        
        System.out.println("CTC of HOD of Physics is " + emp_HOD_Phy.getCTC());
        System.out.println("CTC of HOD of Chemistry is " + emp_HOD_Chem.getCTC());
        System.out.println("CTC of HOD of Biology is " + emp_HOD_Bio.getCTC());
        
        System.out.println("CTC of HOD of Philosophy is " + emp_HOD_Phil.getCTC());
        System.out.println("CTC of HOD of Sociology is " + emp_HOD_Sociology.getCTC());
        System.out.println("CTC of HOD of Logic is " + emp_HOD_Logic.getCTC());
        
    }
    
}
