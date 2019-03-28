/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;

/**
 *
 * @author Heikki
 */
public class ClockTimer extends Observable implements Runnable {
    
    private int hour;
    private int minute;
    private int second;
    
    private boolean running;
    
    public ClockTimer() {
        hour = 0;
        minute = 0;
        second = 0;
    }
    
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    
    private void tick() {
        second++;
        if(second > 59) {
            second = 0;
            minute++;
            if (minute > 59) {
                minute = 0;
                hour++;
            }
        }
        setChanged();
        notifyObservers(new int[]{hour, minute, second});
    }
    
    @Override
    public void run() {
        running = true;
        while (running) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
            tick();
        }
    }

    public void stop() {
        running = false;
    }
}
