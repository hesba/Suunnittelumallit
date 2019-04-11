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
public class Arvuuttaja {    
    
    public void liityPeliin(Arvaaja arvaaja) {
        arvaaja.setVastaus(new Vastaus());
    }

    public boolean arvaa(int arvaus, Arvaaja arvaaja) {
        Vastaus vastaus = (Vastaus) arvaaja.getVastaus();
        
        System.out.println(arvaaja.getNimi() + " arvasi luvun: " + arvaus);
        
        if (arvaus == vastaus.getLuku()) {
            System.out.println(arvaaja.getNimi() + " arvasi oikein");
            arvaaja.setOikeaArvaus(true);
            return true;
        } else {
            System.out.println(arvaaja.getNimi() + " arvasi väärin");
            return false;
        }
    }

    private class Vastaus {
        
        private int luku;

        private Vastaus() {
            Random random = new Random();
            this.luku = random.nextInt(10) + 1;
        }
        
        public int getLuku() {
            return luku;
        }
    }
}
