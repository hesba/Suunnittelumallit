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
public class Employee {
    
    private double salary;
    private Management manager;

    public Employee(double salary, Management manager) {
        this.salary = salary;
        this.manager = manager;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void askForRaise(double raise) {
        manager.handle(this, raise);
    }
}
