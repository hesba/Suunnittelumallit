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
public class SummerBody implements HumanState {
    
    private Human human;
    private final int benches = 80;

    public SummerBody(Human human) {
        this.human = human;
    }

    @Override
    public void evolve() {
        human.setState(new GymRat(human));
    }

    @Override
    public void exercise() {
        System.out.println(toString() + " starts to grow! Benches: " + benches + " kg");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Summerbody";
    }  
}
