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
public interface HumanState {
    
    void evolve();
    void exercise();
    void accept(Visitor visitor);
}
