/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author Heikki
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Management supervisor = new Supervisor();
        Employee employee = new Employee(3000, supervisor);
        
        employee.askForRaise(200);
        
        System.out.format("%.2f\n", employee.getSalary());
    }
    
}
