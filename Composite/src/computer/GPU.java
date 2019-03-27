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
public class GPU implements Component {
    
    private double price;

    @Override
    public double getPrice() {
        return price;
    }

    public GPU(double price) {
        this.price = price;
    }

    public GPU() {
        price = 225;
    }
    
    
}
