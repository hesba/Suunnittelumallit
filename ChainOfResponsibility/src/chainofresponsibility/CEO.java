/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author Heikki
 */
public class CEO extends Management {

    public CEO() {
        super(null);
    }

    @Override
    public String toString() {
        return "CEO";
    }
    
    
}
