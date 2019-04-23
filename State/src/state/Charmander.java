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
public class Charmander extends PokemonState {
    
    private static Charmander INSTANCE;
    private final double weight = 8.5;
    private final double height = 0.6;

    private Charmander() {}
    
    public static synchronized Charmander getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charmander();
        }
        return INSTANCE;
    }
    
    @Override
    public boolean evolve(Pokemon pokemon) {
        super.changeState(pokemon, Charmeleon.getInstance());
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
        return "Charmander";
    }
}
    
