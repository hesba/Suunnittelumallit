/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author silla
 */
public class Oppilas extends AterioivaOtus {
    public Juoma createJuoma() {
        return new Limppari();
    }
}
