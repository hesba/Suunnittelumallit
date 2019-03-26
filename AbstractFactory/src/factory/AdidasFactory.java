/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import product.Cap;
import product.Pants;
import product.Shirt;
import product.Shoes;


/**
 *
 * @author Heikki
 */
public class AdidasFactory implements ClothFactory {

    @Override
    public void createCap() {
        Cap cap = new Cap("Adidas");
        System.out.println(cap);
    }

    @Override
    public void createShirt() {
        Shirt shirt = new Shirt("Adidas");
        System.out.println(shirt);
    }

    @Override
    public void createPants() {
        Pants pants = new Pants("Adidas");
        System.out.println(pants);
    }

    @Override
    public void createShoes() {
        Shoes shoes = new Shoes("Adidas");
        System.out.println(shoes);
    }
    
}
