/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.queues;

/**
 *
 * @author Denny Oommen Mathew <denny@dennymathew.com>
 */
public class LinkedListQueue<Item> implements Queue<Item> {

    private class Node<Item> {
        Item item;
        Node<Item> next;
    }
    
    private Node<Item> head;
    private Node<Item> tail;

    @Override
    public void add(Item item) {
        tail = new Node();
        if(tail == null) {
            tail.item = item;
            head = tail;
        } else {
            Node<Item> oldTail = tail; 
            tail.item = item;
            oldTail.next = tail;
        }
    }

    @Override
    public Item remove() {
        if(isEmpty()) {
            return null;
        } else {
            Node<Item> oldNode = head;
            head = head.next;
            return oldNode.item;    
        }
    }

    @Override
    public Item element() {
        return head.item;
    }
    
    @Override
    public boolean isEmpty() {
      return tail==null;
    }
    
    public LinkedListQueue() {
    }
    
}
