/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;



/**
 *
 * @author Heikki
 */
public class Charmander implements PokemonState {
    
    private final double weight = 8.5;
    private final double height = 0.6;

    @Override
    public void evolve(main.Pokemon pokemon) {
        pokemon.setpState(new Charmeleon());
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
        System.out.println("Charmander");
    }
}
    
