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
public class GymRat implements HumanState {
    
    private Human human;
    
    public GymRat(Human human) {
        this.human = human;
    }

    @Override
    public void evolve() {
        human.setState(new BodyBuilder(human));
    }

    @Override
    public void exercise() {
        System.out.println(toString() + " works hard every day and is becoming super muscular!");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Gymrat";
    } 
}
