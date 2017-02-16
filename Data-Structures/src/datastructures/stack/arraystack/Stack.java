/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stack.arraystack;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;
import datastructures.stack.IStack;

/**
 *
 * @author Denny Oommen Mathew <denny.oommen.mathew@hp.com>\
 * 
 */
public class Stack<Item extends Object> 
        implements Iterable<Item>, 
        IStack<Item>{
    
    private Item[] stack_space;
    private int size;
    private int top;

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item peek() {
        return stack_space[top];
    }

    @Override
    public void push(Item item) {
        if(isFull()) {
            
        }
        stack_space[++top] = item;
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == size - 1);
    }
    
    public Stack(int size) {
        this.stack_space = (Item[]) new Object[size];
        this.size = size;        
        this.top = -1;
    }
    
    
}
