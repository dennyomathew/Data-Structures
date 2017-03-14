/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlist;

import java.util.Iterator;

/**
 *
 * @author Denny Oommen Mathew <denny@dennymathew.com>
 */
public class SinglyLinkedList<Item extends Comparable<Item>> implements List<Item>{

    private class Node<Item> {
        Item item;
        Node<Item> next;
    }
    
    private Node<Item> head;
    private int size = 0;
    
    
    private class LinkedListIterator implements Iterator<Item> {

        private Node<Item> top = head;
        public LinkedListIterator() {
        }

        @Override
        public boolean hasNext() {
            return (top!=null);
        }

        @Override
        public Item next() {
            Item item = top.item;
            top = top.next;
            return item;
        }
    }

    @Override
    public void insert(Item item) {
        if(head == null) {
            head = new Node();
            head.item = item;
        } else {
            Node<Item> newNode = new Node();
            newNode.item = item;
            newNode.next = head;
            head = newNode;
        }
        this.size++;
    }
    
    @Override
    public void insertAtEnd(Item item) {
        Node temp = head;
        Node newNode = new Node();
        newNode.item = item;
        
        if( temp != null ) {
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        } else {
            head = newNode;
        }
    }
    

    @Override
    public void remove(int index) {
        if(index <= size - 1) {
           Node<Item> node = head;
           if(index == 0) {
              head = head.next;
              node = null;
           } else {
              int i = 0;
              while(i < index - 1) {
                node = node.next;               
                i++;
              }
              Node<Item> delNode = node.next;
              node.next = node.next.next;
              delNode = null;
           }
           size--;
        }      
    }
    
    private void remove(Item item, Node<Item> prevNode, Node<Item> actualNode){
        
        while(actualNode != null) {
            if(actualNode.item.compareTo(item) == 0 ){
                prevNode.next = actualNode.next;
                actualNode = null;
                return;
            }
            prevNode = actualNode;
            actualNode = actualNode.next;
        }
        
    }

    @Override
    public void remove(Item item) {
        if(head == null) return;
        size--;
        if(head.item.compareTo(item) == 0 ) {
            head = head.next.next;
        } else {
            remove(item, head, head.next);
        }
        
    }

    
    public SinglyLinkedList() {
        size = 0;
    }
    
    @Override
    public int compareTo(Item o) {
        return 0;
    }

    @Override
    public int size() {
      return size;
    }
    
    
    public void traverse() {
        Node node = head;
        while(node!=null) {
            System.out.println(node.item.toString());
            node = node.next;
        }
    }
    
        @Override
    public Iterator<Item> iterator() {
        return new LinkedListIterator();
    }
    
}
