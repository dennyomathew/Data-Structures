/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stack;

import java.util.Iterator;
/**
 *
 * @author Denny Oommen Mathew <denny@dennymathew.com>
 * 
 * @param <Item> 
 */
public class ArrayStack<Item extends Object> implements Stack<Item>{
    
    private Item[] stack_space;
    private int size;
    private int top;
    
    private final static int SIZE = 10;

    @Override
    public Iterator<Item> iterator() {
        return new ArrayStackIterator();
    }

    //O(1)
    @Override
    public Item pop() {
        if(isEmpty()) {
            return null;
        }
  
        Item item = stack_space[top];
        stack_space[top--] = null;
        
        //Optimal shrinking solution
        if(top > 0 && top == stack_space.length / 4 ) {
            resize(stack_space.length / 4);
        }
        
        return item;
    }

    //O(1)
    @Override
    public Item peek() {
        return stack_space[top];
    }

    //Amortized O(1)
    @Override
    public void push(Item item) {
        if(isFull()) {
            resize(2*stack_space.length);
        }
        stack_space[++top] = item;
    }
    
    //O(1)
    @Override
    public boolean isEmpty() {
        return (top == -1);
    }
    
    private boolean isFull() {
        return (top == size - 1);
    }
    
    //O(N)
    private void resize(int capacity) {
        Item[] item = (Item[]) new Object[capacity];
        System.arraycopy(stack_space, 0, item, 0, size);
        stack_space = item;
        size = capacity;
    }
    
    public ArrayStack(int size) {
        this.stack_space = (Item[]) new Object[size];
        this.size = size;        
        this.top = -1;
    }
    
    public ArrayStack() {
        this(SIZE);
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
