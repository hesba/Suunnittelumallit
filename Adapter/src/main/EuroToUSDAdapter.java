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
public class EuroToUSDAdapter implements USDIF {

    private final double USDtoEuroCourse = 0.888;
    private final double euroToUSDCourse = 1.126;
    
    private EuroIF euro;
    
    public EuroToUSDAdapter(EuroIF e) {
        euro = e;
    }
    
    @Override
    public double getUSD() {
        return euro.getEuros() * euroToUSDCourse;
    }

    @Override
    public void setUSD(double ammount) {
        euro.setEuro(ammount * USDtoEuroCourse);
    }
    
}
