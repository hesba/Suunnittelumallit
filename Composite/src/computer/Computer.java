/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import java.util.ArrayList;


/**
 *
 * @author Heikki
 */
public class Computer {
    
    private double priceall;
    private ArrayList<Component> components = new ArrayList();
    
    public Computer() {
        priceall = 0;
    }
    
    public void addParts(Component comp) {
        components.add(comp);
    }
    
    public double countPrice() {
        priceall = 0;
        for (Component c : components) {
            priceall += c.getPrice();
        }
        return priceall;
    }
    
    
    
    
}
