package main;

import state.Charmander;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Heikki
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pokemon pokemon = new Pokemon(Charmander.getInstance());
        
        main.print(pokemon);
        for (int i = 1; i < 3; i++) {
            pokemon.evolve();
            main.print(pokemon);
        }   
    }

    private static void print(Pokemon pokemon) {
        System.out.println("Name: " + pokemon.getName());
        System.out.println("Height: " + pokemon.getHeight());
        System.out.println("Weight: " + pokemon.getWeight());
    }
    
}
