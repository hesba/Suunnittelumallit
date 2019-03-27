/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author Heikki
 */
public class Case implements Component {
    
    private double price;

    @Override
    public double getPrice() {
        return price;
    }
    
    private Component[] components = { new Motherboard() };
    
    private double countPrice() {
        price = 0;
        for (Component comp : components) {
            price += comp.getPrice();
        }
        price += 45;
        return price;
    }
    
    public Case() {
        price = countPrice();
    }
 
}
