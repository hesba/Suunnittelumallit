/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import state.Charmander;
import state.PokemonState;

/**
 *
 * @author Heikki
 */
public class Pokemon {
    
    private PokemonState pState = new Charmander();
        
    public void evolve() {
        pState.evolve(this);
    }
    
    public void pokemonStatus() {
        pState.pokemonStatus();
    }

    public void setpState(PokemonState pState) {
        this.pState = pState;
    }
    
    public double getHeight() {
        return pState.getHeight();    
    }

    public double getWeight() {
        return pState.getWeight();
    }
    
}
