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
public abstract class Management {
    
    private Management successor;
    protected double raiseTreshold;
    
    public Management(Management m) {
        successor = m;
    }
    
    public void handle(Employee employee, double raise) {
        
        double newSalary = employee.getSalary() + raise;
        double percent = (newSalary / employee.getSalary()) - 1;
        
        if (successor != null) {
            if (percent <= raiseTreshold) {
                employee.setSalary(newSalary);
            } else {
                System.out.println(String.format("%.1f", percent * 100) 
                        + "% raise is too much for " + this + ", asks if " 
                        + successor + " can approve it.");
                successor.handle(employee, raise);
            }
        }
        else {
            System.out.println("Your new salary is:");
            employee.setSalary(newSalary);   
        }
    }
}
