/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Ingredients.Beef;
import Ingredients.Bun;
import Ingredients.Ingredients;
import Ingredients.Salad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author silla
 */
public class McDonalds implements BurgerBuilder<List<Ingredients>> {

    List<Ingredients> burger;
    
    @Override
    public void buildBun() {
        burger.add(new Bun());
    }

    @Override
    public void buildBeef() {
        burger.add(new Beef());
    }

    @Override
    public void buildSalad() {
        burger.add(new Salad());
    }

    @Override
    public void createBurger() {
        burger = new ArrayList<>();
    }

    @Override
    public List<Ingredients> getBurger() {
        return burger;
    }
    
    
}
