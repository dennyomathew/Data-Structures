/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stack;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;
import datastructures.stack.Stack;

/**
 *
 * @author Denny Oommen Mathew <denny@dennymathew.com>\
 * 
 * @param <Item> 
 */
public class ArrayStack<Item extends Object> implements Stack<Item>{
    
    private Item[] stack_space;
    private int size;
    private int top;

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item pop() {
        if(isEmpty()) {
            return null;
        }
  
        Item item = stack_space[top];
        stack_space[top--] = null;
        return item;
    }

    @Override
    public Item peek() {
        return stack_space[top];
    }

    @Override
    public void push(Item item) {
        if(isFull()) {
            inflate();
        }
        stack_space[++top] = item;
    }
    
    @Override
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == size - 1);
    }
    
    private void inflate() {
        Item[] item = (Item[]) new Object[size * 2];
        System.arraycopy(stack_space, 0, item, 0, size);
        stack_space = item;
    }
    
    public ArrayStack(int size) {
        this.stack_space = (Item[]) new Object[size];
        this.size = size;        
        this.top = -1;
    }
    
    
}
