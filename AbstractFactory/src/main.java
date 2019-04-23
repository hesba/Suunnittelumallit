
import factory.AdidasFactory;
import factory.BossFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Heikki
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AdidasFactory af = new AdidasFactory();
        BossFactory bf = new BossFactory();
        Jasper jasper = new Jasper();
        
        jasper.createOutfit(af);
        
        System.out.println("Jasper graduated as an Engineer.");
        
        jasper.createOutfit(bf);
        
    }
    
}
