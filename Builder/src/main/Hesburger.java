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
public class Hesburger implements BurgerBuilder<StringBuilder> {

    StringBuilder sb;
    
    @Override
    public void buildBun() {
        sb.append("Bun\n");
    }

    @Override
    public void buildBeef() {
        sb.append("Beef\n");
    }

    @Override
    public void buildSalad() {
        sb.append("Salad\n");
    }

    @Override
    public void createBurger() {
        sb = new StringBuilder();
    }

    @Override
    public StringBuilder getBurger() {
        return sb;
    }
    
}
