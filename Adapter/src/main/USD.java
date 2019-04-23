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
public class USD implements USDIF{

    private double USD;
    
    @Override
    public double getUSD() {
        return USD;
    }

    @Override
    public void setUSD(double ammount) {
        USD = ammount;
    }
    
}
