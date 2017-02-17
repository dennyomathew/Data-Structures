/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stack;

/**
 *
 * @author Denny Oommen Mathew <denny.oommen.mathew@hp.com>
 * @param <Item>
 */
public interface Stack<Item> extends Iterable<Item> {
    
    Item pop();
    Item peek();
        
    void push(Item item);
    
    boolean isEmpty();
    
    
   
}
