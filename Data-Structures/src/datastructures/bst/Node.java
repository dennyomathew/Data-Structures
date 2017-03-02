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
public class Node<Item> {
    
    private Item item;    
    private Node<Item> leftNode;
    private Node<Item> rightNode;

    public Node<Item> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<Item> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<Item> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<Item> rightNode) {
        this.rightNode = rightNode;
    }
    
    public Node(Item item) {
        this.item = item;
    }
    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
}
