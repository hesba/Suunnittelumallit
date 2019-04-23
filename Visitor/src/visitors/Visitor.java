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
public interface Visitor {
    
    void visit(SummerBody summerBody);
    void visit(GymRat gymRat);
    void visit(BodyBuilder bodyBuilder);
}
