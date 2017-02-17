/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stack;

import java.util.Iterator;
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
    public Iterator<Item> iterator() {
        return new ArrayStackIterator();
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
    
    private boolean isFull() {
        return (top == size - 1);
    }
    
    private void inflate() {
        Item[] item = (Item[]) new Object[size * 2];
        System.arraycopy(stack_space, 0, item, 0, size);
        stack_space = item;
        size = size * 2; 
    }
    
    public ArrayStack(int size) {
        this.stack_space = (Item[]) new Object[size];
        this.size = size;        
        this.top = -1;
    }

    private class ArrayStackIterator implements Iterator<Item>{

        private int ptr = top;
        
        public ArrayStackIterator() {
        }

        @Override
        public boolean hasNext() {
            return (ptr >- 1);
        }

        @Override
        public Item next() {
            return stack_space[ptr--];
        }
    }
    
    
}
