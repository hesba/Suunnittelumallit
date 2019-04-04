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
public interface PokemonState {
    
    void evolve(Pokemon pokemon);
    double getHeight();
    double getWeight();
    void pokemonStatus();
    
}
