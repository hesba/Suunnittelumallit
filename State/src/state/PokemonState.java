/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import main.Pokemon;

/**
 *
 * @author Heikki
 */
public abstract class PokemonState {
    
    public abstract boolean evolve(Pokemon pokemon);
    public abstract double getHeight();
    public abstract double getWeight();
    
    public String getName() {
        return this.toString();
    }
    
    void changeState(Pokemon pokemon, PokemonState pokemonState) {
        pokemon.changeState(pokemonState);
    }
}
