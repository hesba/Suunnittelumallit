/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author Heikki
 */
public class Cap extends Clothing {
    
    public Cap(String brand) {
        super(brand);
    }

    @Override
    public String toString() {
        return "Cap: " + brand;
    }
    
}
