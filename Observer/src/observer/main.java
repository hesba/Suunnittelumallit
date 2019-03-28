/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.io.IOException;


/**
 *
 * @author Heikki
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ClockTimer timer = new ClockTimer();
        timer.addObserver(new DigitalClock());
        
        new Thread(timer).start();
        
        System.in.read();
        timer.stop();
    }
    
}
