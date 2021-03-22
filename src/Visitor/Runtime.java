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
public class Runtime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1 = new Employee("Person1", 10);
        Employee e2 = new Employee("Person2", 15);
        Employee e3 = new Employee("Person3", 9);
        Employee e4 = new Employee("Person4", 24);

        VacationVisitor VV = new VacationVisitor();

        VV.visit(e1);
        VV.visit(e2);
        VV.visit(e3);
        VV.visit(e4);

        System.out.println("Total Days : " + VV.getTotalDays());

    }

}
