/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import state.PokemonState;

/**
 *
 * @author Heikki
 */
public class Pokemon {
    
    private PokemonState pState;
    
    public Pokemon(PokemonState pokemonState) {
        pState = pokemonState;
    }
    public void changeState(PokemonState pokemonState) {
        pState = pokemonState;
    }
        
    public boolean evolve() {
        return pState.evolve(this);
    }
    
    public double getHeight() {
        return pState.getHeight();    
    }

    public double getWeight() {
        return pState.getWeight();
    }
    
    public String getName() {
        return pState.getName();
    }
    
}
