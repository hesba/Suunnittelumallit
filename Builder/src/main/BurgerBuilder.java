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
public interface BurgerBuilder <B> {
    void buildBun();
    void buildBeef();
    void buildSalad();
    void createBurger();
    B getBurger();
}
