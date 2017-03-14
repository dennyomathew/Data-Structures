/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.graphs.bfs;

import datastructures.linkedlist.List;
import datastructures.linkedlist.SinglyLinkedList;

/**
 *
 * @author Denny Oommen Mathew <denny@dennymathew.com>
 */
public class Vertex<Item> implements Comparable<Item> {
    
    private Item data;
    private List<Vertex> neighbourVertices;
    private boolean isVisted;
    
    public Vertex(Item data) {
        this.data = data;
        this.neighbourVertices = new SinglyLinkedList<>();
        this.isVisted = false;
    }
    
    public void addVertex(Vertex v) {
        neighbourVertices.insertAtEnd(v);
    }
    
    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

    public List<Vertex> getNeighbourVertices() {
        return neighbourVertices;
    }

    public void setNeighbourVertices(List<Vertex> neighbourVertices) {
        this.neighbourVertices = neighbourVertices;
    }

    public boolean isVisted() {
        return isVisted;
    }

    public void setVisted(boolean isVisted) {
        this.isVisted = isVisted;
    }
    
    @Override
    public String toString() {
        return data.toString();
    }
    

    @Override
    public int compareTo(Item o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
