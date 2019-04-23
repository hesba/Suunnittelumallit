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
public class Charizard extends PokemonState {
    
    private static Charizard INSTANCE;
    private final double weight = 90.5;
    private final double height = 1.7;

    private Charizard() {}
    
    public static synchronized Charizard getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Charizard();
        }
        return INSTANCE;
    }
    
    @Override
    public boolean evolve(Pokemon pokemon) {
        return false;
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
        return "Charizard";
    }
}
