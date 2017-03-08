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
        deleteNode(root, item);
    }
    
    private Node<Item> deleteNode(Node<Item> node, Item data) {
        if(node == null) return node;
        
        if( data.compareTo(node.getItem()) < 0) {            
            node.setLeftNode(deleteNode(node.getLeftNode(), data));
        } else if( data.compareTo(node.getItem()) > 0) {
            node.setRightNode(deleteNode(node.getRightNode(), data));
        } else {
            /* We have the item */
           if(node.getLeftNode() == null && node.getRightNode() == null) {
               return null;
           } 
           if(node.getLeftNode() == null) {
               Node<Item> temp = node.getRightNode();
               node = null;
               return temp;
           }
           if(node.getRightNode() == null) {
               Node<Item> temp = node.getLeftNode();
               node = null;
               return temp;
           }
           
           Node<Item> temp = getPredecessor(node.getLeftNode());
           
           node.setItem(temp.getItem());  //Swap predecessor with the node
           node.setLeftNode(deleteNode(node.getLeftNode(), temp.getItem()));
           
        }
      return node;
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
    
    private Node<Item> getPredecessor(Node<Item> node) {
        if(node.getRightNode()!= null ) {
            return getPredecessor(node.getRightNode());
        }
        return node;
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
