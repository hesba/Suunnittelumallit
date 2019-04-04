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
public class Charizard implements PokemonState {
    
    private final double weight = 90.5;
    private final double height = 1.7;

    @Override
    public void evolve(Pokemon pokemon) {
        pokemon.setpState(this);
        System.out.println("Pokemon has evolved.");
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void pokemonStatus() {
        System.out.println("Charizard");
    }
}
