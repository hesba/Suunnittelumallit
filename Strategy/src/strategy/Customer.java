/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author Heikki
 */
public class Customer {
    
    private ListConverter listConverter;
    
    public Customer(ListConverter listConverter) {
        this.listConverter = listConverter;
    }

    public Customer() {
    }
    
    public void setConverter(ListConverter listConverter) {
        this.listConverter = listConverter;
    }
    
    public <E> String listConverter(List<E> list) {
        return listConverter.listToString(list);
    }
    
}
