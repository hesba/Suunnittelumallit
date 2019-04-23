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
public class RAM implements Component {
    
    private double price;
    
    public RAM(double price) {
        this.price = price;
    }
    
    public RAM() {
        price = 99;
    }

    @Override
    public double getPrice() {
        return price;
    }

    
}
