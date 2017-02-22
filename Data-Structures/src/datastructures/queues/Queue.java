/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.queues;

/**
 *
 * @author Denny Oommen Mathew <denny.oommen.mathew@hp.com>
 */
public interface Queue<Item> {
    
    /* Exception versions */
    void add(Item item);    // Enqueue
    Item remove();          // Dequeue
    Item element();         // peek
    
    /* Return only equivalents */
    void offer(Item item);
    void poll();
    Item peek();
}
