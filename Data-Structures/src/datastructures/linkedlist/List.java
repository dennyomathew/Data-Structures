/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.linkedlist;

/**
 *
 * @author Denny Oommen Mathew <denny@dennymathew.com>
 * @param <T>
 */
public interface List<Item> extends Comparable<Item>, Iterable<Item> {

    void insert(Item item);
    void insertAtEnd(Item item);
    void remove(int index);
    void remove(Item item);
    
    int size();

    void traverse();

    
}
