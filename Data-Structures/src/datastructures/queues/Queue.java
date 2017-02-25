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
public interface Queue<Item> {
    

    void add(Item item);    // Enqueue
    Item remove();          // Dequeue
    Item element();         // peek
    
    boolean isEmpty();
}
