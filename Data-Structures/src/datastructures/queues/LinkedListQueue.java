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

    private class Node {
        Item item;
        Node next;
    }
    
    private Node head;
    private Node tail;

    @Override
    public void add(Item item) {
        if(tail == null) {
            tail = new Node();
            tail.item = item;
            tail.next = null;
            head = tail;
        } else {
            Node oldTail = tail; 
            tail = new Node();
            tail.item = item;
            tail.next = null;
            oldTail.next = tail;
        }
    }

    @Override
    public Item remove() {
        if(isEmpty()) {
            return null;
        } else {
            Node oldNode = head;
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
        head = tail = null;
    }
    
}
