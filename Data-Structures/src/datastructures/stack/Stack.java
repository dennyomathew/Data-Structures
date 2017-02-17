/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stack;

/**
 *
 * @author Denny Oommen Mathew <denny.oommen.mathew@hp.com>
 */
public interface Stack<T> {
    
    T pop();
    T peek();
        
    void push(T item);
    
    boolean isEmpty();
    
    
   
}
