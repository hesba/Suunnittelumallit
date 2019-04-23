/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author silla
 */
public class Chef {
    
    private BurgerBuilder burgerBuilder;

    public Chef(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }
    
    
    
    public void setBurgerBuilder(BurgerBuilder builder) {
        this.burgerBuilder = builder;
    }
    
    public Object getBurger() {
        return burgerBuilder.getBurger();
    }
    
    public void constructBurger() {
        burgerBuilder.createBurger();
        burgerBuilder.buildBun();
        burgerBuilder.buildBeef();
        burgerBuilder.buildSalad();
    }
}
