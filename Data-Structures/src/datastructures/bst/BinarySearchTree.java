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
public class BinarySearchTree<Item extends Comparable<Item>> implements Tree<Item> {
    
    private Node<Item> root;

    @Override
    public void insert(Item item) {
        if(root == null) {
            root = new Node(item);            
        } else {
            insertNode(root, item);
        }
    }
    
    private void insertNode(Node<Item> node, Item item) {
        if(item.compareTo(node.getItem()) < 0 ) {
            if( node.getLeftNode() != null ) {
                insertNode(node.getLeftNode(), item);
            } else {
                Node newNode = new Node(item);
                node.setLeftNode(newNode);
            }
        } else {
            if( node.getRightNode() != null ) {
                insertNode(node.getRightNode(), item);
            } else {
                Node newNode = new Node(item);
                node.setRightNode(newNode);
            }         
        }
    }

    @Override
    public void delete(Item item) {
   
    }

    @Override
    public void traverse() {
        inOrderTraversal(root);
    }
    
    private void inOrderTraversal(Node<Item> node) {
        if(node == null) return;   // base case
        inOrderTraversal(node.getLeftNode());
        System.out.print(node);
        inOrderTraversal(node.getRightNode());      
    }

    private Item getMin(Node<Item> node) {
       if(node.getLeftNode() != null) {
           return getMin(node.getLeftNode());
       }
      
       return node.getItem();       
    }

    private Item getMax(Node<Item> node) {
       if(node.getRightNode() != null) {
           return getMax(node.getRightNode());
       }
      
       return node.getItem();      
    }

    @Override
    public Item getMax() {
       return getMax(root);
    }

    @Override
    public Item getMin() {
       return getMin(root);
    }


    
}
