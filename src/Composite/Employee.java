/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1
 */
public class Employee {
    private String designation;
    private double salary;
    private List<Employee> subEmp;

    public Employee(){
        subEmp = new ArrayList<>();
    }
    
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getSubEmp(String name) {
        for(int i = 0; i < subEmp.size(); i++ ){
            if(subEmp.get(i).designation.equals(name))
                return subEmp.get(i);
        }
        return null;
    }

    public void setSubEmp(Employee subEmp) {
        this.subEmp.add(subEmp);
    }
    
    public double getCTC(){
        return salary + getChildCTC();
    }
    
    private double getChildCTC(){
        double salary = 0;
        for(int i = 0; i < subEmp.size(); i++){
            salary += subEmp.get(i).getCTC();
        }
        return salary;
    }
}
