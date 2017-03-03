/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlist;

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
    
}
