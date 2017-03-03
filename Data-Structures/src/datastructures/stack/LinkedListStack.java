/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.stack;

import java.util.Iterator;

/**
 *
 * @author Denny
 */
public class LinkedListStack<Item extends Object> implements Stack<Item> {
    
    private final static int SIZE = 10;
    
    private int size;

    private class LinkedListStackIterator implements Iterator<Item> {

        private Node<Item> top = head;
        private int lsize = size;
        public LinkedListStackIterator() {
        }

        @Override
        public boolean hasNext() {
            return (lsize > 0);  //top!=null
        }

        @Override
        public Item next() {
            Item item = top.item;
            top = top.next;
            lsize--;
            return item;
        }
    }
        
    private class Node<Item> {
        Item item;
        Node<Item> next;
    }
    
    private Node<Item> head = null;

    @Override
    public Item pop() {
        if(isEmpty()) {
            return null;
        }
        Item item = head.item;
        head = head.next;
        size--;
        return item;
    }

    @Override
    public Item peek() {
        return head.item;
    }

    @Override
    public void push(Item item) {
       Node<Item> newItem = new Node();
       newItem.item = item;
       newItem.next = head;
       size++;
       head = newItem;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedListStackIterator();
    }
    
    public LinkedListStack() {
        size = 0;
    }
    
    
}
