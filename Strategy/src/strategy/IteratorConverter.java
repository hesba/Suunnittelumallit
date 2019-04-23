/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Heikki
 */
public class IteratorConverter implements ListConverter {

    @Override
    public <E> String listToString(List<E> list) {
        Iterator iterator = list.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next().toString()).append(", \n");
        }
        return stringBuilder.toString();
    }

}
