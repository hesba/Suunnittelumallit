/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Ingredients.Ingredients;
import java.util.List;

/**
 *
 * @author silla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chef chef = new Chef(new Hesburger());
        chef.constructBurger();
        System.out.println("Hesburger: ");
        System.out.println(chef.getBurger());
        
        System.out.println("McDonald's: ");
        chef.setBurgerBuilder(new McDonalds());
        chef.constructBurger();
        ((List<Ingredients>) chef.getBurger()).forEach(System.out::println);  
    }
    
}
