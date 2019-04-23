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
public class Motherboard implements Component {

    private double price;
    
    @Override
    public double getPrice() {
        return countPrice();
    }

    public Component[] components = {
        new RAM(),
        new CPU(),
        new NIC(),
        new GPU()
    };
    
    private double countPrice() {
        price = 0;
        for (Component comp : components) {
            price += comp.getPrice();
        }
        price += 110;
        return price;
    }
    
    public Motherboard() {
        price = countPrice();
    }
    
    
    
}
