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
        if(tail == null) {
            tail = new Node();
            tail.item = item;
            head = tail;
        } else {
            Node<Item> oldTail = tail; 
            tail = new Node();
            tail.item = item;
            oldTail.next = tail;
        }
    }

    @Override
    public Item remove() {
        if (isEmpty()) {
            return null;
        } else {
            Node<Item> oldNode = head;
            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;  //It indicates that the Q has only one item
            }
            Item item = oldNode.item;
            oldNode = null;   //For GC
            return item;
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
