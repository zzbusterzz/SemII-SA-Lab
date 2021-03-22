/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author 1
 */
public class Employee {
    private int vacDays;
    private String name;
    
    public Employee(String name, int vacDays){
        this.vacDays = vacDays;
        this.name = name;
    }
    
    public int getVacDays(){
        return vacDays;
    }
    
    public void accept(VacationVisitor visitor){
        visitor.visit(this);
    }
}
