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
public class ArrayConverter implements ListConverter {

    @Override
    public <E> String listToString(List<E> list) {
        Object[] array = list.toArray();
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 1; i < array.length + 1; i++) {
            stringBuilder.append(array[i-1]).append(", ");
            if (i % 2 == 0) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
