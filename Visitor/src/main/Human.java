package main;


import states.HumanState;
import states.SummerBody;
import visitors.Visitor;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heikki
 */
public class Human {
    
    HumanState humanState;

    public Human() {
        humanState = new SummerBody(this);
    }       

    public void setState(HumanState humanState) {
        this.humanState = humanState;
    }
    
    public void evolve() {
        humanState.evolve();
    }
    
    public void exercise() {
        humanState.exercise();
    }
    
    public void accept(Visitor visitor) {
        humanState.accept(visitor);
    }

    @Override
    public String toString() {
        return humanState.toString();
    }
    
    
    
}
