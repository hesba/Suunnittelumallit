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
public class Charmeleon extends PokemonState {
    
    private static Charmeleon INSTANCE;
    private final double weight = 19.0;
    private final double height = 1.1;

    private Charmeleon() {}
    
    public static synchronized Charmeleon getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charmeleon();
        }
        return INSTANCE;
    }
    
    @Override
    public boolean evolve(Pokemon pokemon) {
        super.changeState(pokemon, Charizard.getInstance());
        return true;
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
    public String toString() {
        return "Charmeleon";
    }
}
