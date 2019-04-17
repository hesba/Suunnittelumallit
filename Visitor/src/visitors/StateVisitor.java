/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitors;

import states.BodyBuilder;
import states.GymRat;
import states.SummerBody;

/**
 *
 * @author Heikki
 */
public class StateVisitor implements Visitor {

    @Override
    public void visit(SummerBody summerBody) {
        System.out.println(summerBody.toString());
    }

    @Override
    public void visit(GymRat gymRat) {
        System.out.println(gymRat.toString());
    }

    @Override
    public void visit(BodyBuilder bodyBuilder) {
        System.out.println(bodyBuilder.toString());
    }
    
}
