import factory.ClothFactory;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heikki
 */
public class Jasper {
    
    
    public void createOutfit(ClothFactory factory) {
        factory.createCap();
        factory.createShirt();
        factory.createPants();
        factory.createShoes();
    }
}
