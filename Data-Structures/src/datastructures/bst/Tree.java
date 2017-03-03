/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.bst;

/**
 *
 * @author Denny Oommen Mathew <denny@dennymathew.com>
 */
public interface Tree<Item> {
    
    public void insert(Item item);
    public void delete(Item item);
    
    public void traverse();
    
    public Item getMax();
    public Item getMin();
    
}
