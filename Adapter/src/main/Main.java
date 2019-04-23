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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EuroIF euro = new Euro();
        euro.setEuro(100);
        
        USDIF adapter = new EuroToUSDAdapter(euro);
        adapter.setUSD(adapter.getUSD() + 100);
        System.out.println(String.format("%.2f", euro.getEuros()) + "€");
        System.out.println("$" + String.format("%.2f", adapter.getUSD()));
    }
    
}
