package main;

import visitors.StateVisitor;
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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Human human = new Human();
        Visitor visitor = new StateVisitor();

        for (int i = 0; i <3; i++) {
            System.out.println("Current state:");
            human.accept(visitor);
            human.exercise();
            human.evolve();
        }
    }

}
