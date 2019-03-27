package computer;

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
        
        Computer computer = new Computer();
        computer.addParts(new Motherboard());
        computer.addParts(new Case());
        System.out.println("Computer costs: " + computer.countPrice());
        
        computer = new Computer();
        computer.addParts(new NIC());
        computer.addParts(new CPU());
        computer.addParts(new RAM());
        System.out.println("Computer costs: " + computer.countPrice());
    }
    
}
