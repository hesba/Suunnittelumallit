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
public class Charmeleon implements PokemonState {
    private final double weight = 19.0;
    private final double height = 1.1;

    @Override
    public void evolve(main.Pokemon pokemon) {
        pokemon.setpState(new Charizard());
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
        System.out.println("Charmeleon");
    }
}
