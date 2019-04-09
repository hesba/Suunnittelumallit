/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.method;

/**
 *
 * @author Heikki
 */
public abstract class Game {
    
    public abstract void initializeGame();
    public abstract void printWinner();
    
    // A template method:
    public final void playOneGame() {
        initializeGame();
    }
}
