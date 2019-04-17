/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states;

import main.Human;
import visitors.Visitor;

/**
 *
 * @author Heikki
 */
public class BodyBuilder implements HumanState {
    
    private Human human;
    private final int benches = 200;
    
    public BodyBuilder(Human human) {
        this.human = human;
    }

    @Override
    public void evolve() {
        System.out.println(toString() + " has finally won a competition!");
    }

    @Override
    public void exercise() {
        System.out.println(toString() + " works out everyday & night and get's on the stage to get money and fame. Benches: " + benches + " kg");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Bodybuilder";
    }
    
    
}
