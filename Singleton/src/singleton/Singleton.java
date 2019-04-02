/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Heikki
 */
public class Singleton {
    
    private static Singleton singletonInstance = null;
    
    public String s;
    
    private Singleton() {
        s = "Hello, I'm from Singleton class!";
    }
    
    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
