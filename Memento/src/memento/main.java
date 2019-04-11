/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.Random;

/**
 *
 * @author Heikki
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        
        Arvaaja eka = new Arvaaja(arvuuttaja, "eka");
        Arvaaja toka = new Arvaaja(arvuuttaja, "toka");
        
        arvuuttaja.liityPeliin(eka);
        arvuuttaja.liityPeliin(toka);
        
        while (!eka.isOikeaArvaus()|| !toka.isOikeaArvaus()) {
            eka.arvaus(randomLuku());
            toka.arvaus(randomLuku());
        }
    }
    
    private static int randomLuku() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
    
}
