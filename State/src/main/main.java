package main;

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
        
        Pokemon pokemon = new Pokemon();
        
        pokemon.pokemonStatus();
        System.out.println("Height: " + pokemon.getHeight());
        System.out.println("Weight: " + pokemon.getWeight());
        
        for (int i = 0; i < 2; i++) {
            pokemon.evolve();
            pokemon.pokemonStatus();
            System.out.println("Height: " + pokemon.getHeight());
            System.out.println("Weight: " + pokemon.getWeight());
        }   
    }
    
}
