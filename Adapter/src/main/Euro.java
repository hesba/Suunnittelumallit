/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author silla
 */
public class Euro implements EuroIF {

    private double euros;
    
    @Override
    public double getEuros() {
        return euros;
    }
    @Override
    public void setEuro(double ammount) {
        euros = ammount;
    }
    
    
}
