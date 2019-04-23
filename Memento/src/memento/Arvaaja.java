/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Heikki
 */
public class Arvaaja {
    
    private Arvuuttaja arvuuttaja;
    private Object vastaus;
    private String nimi;
    private boolean oikeaArvaus;

    public Arvaaja(Arvuuttaja a, String n) {
        this.nimi = n;
        this.arvuuttaja = a;
    }
    
    public boolean arvaus(int luku) {
        if (oikeaArvaus) {
            return true;
        }
        return arvuuttaja.arvaa(luku, this);
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Object getVastaus() {
        return vastaus;
    }

    public void setVastaus(Object vastaus) {
        this.vastaus = vastaus;
    }

    public boolean isOikeaArvaus() {
        return oikeaArvaus;
    }

    public void setOikeaArvaus(boolean oikeaArvaus) {
        this.oikeaArvaus = oikeaArvaus;
    }
}
