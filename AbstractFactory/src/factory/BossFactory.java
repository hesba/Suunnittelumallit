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
public class BossFactory implements ClothFactory {

    @Override
    public void createCap() {
        Cap cap = new Cap("Boss");
        System.out.println(cap);
    }

    @Override
    public void createShirt() {
        Shirt shirt = new Shirt("Boss");
        System.out.println(shirt);
    }

    @Override
    public void createPants() {
        Pants pants = new Pants("Boss");
        System.out.println(pants);
    }

    @Override
    public void createShoes() {
        Shoes shoes = new Shoes("Boss");
        System.out.println(shoes);
    }
    
}
