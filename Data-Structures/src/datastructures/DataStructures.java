/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import datastructures.app.DijkstraExpEvaluator;
import datastructures.bst.BinarySearchTree;
import datastructures.bst.Tree;
import datastructures.graphs.bfs.BFS;
import datastructures.graphs.Vertex;
import datastructures.graphs.dfs.DFS;
import datastructures.graphs.dfs.DFS.DFS_MODE;
import datastructures.linkedlist.List;
import datastructures.linkedlist.singly.LinkedList;
import datastructures.queues.Queue;
import datastructures.queues.LinkedListQueue;

//import java.util.*;

/**
 *
 * @author Denny Oommen Mathew <denny@dennymathew.com>
 */
public class DataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        List<Integer> j = new LinkedList<>();
        j.insert(1);
        j.insert(2);
        j.insert(4);

        j.traverse();

        
        DijkstraExpEvaluator eval = new DijkstraExpEvaluator();
        eval.evaluateExp("( 2 + 3 )");
        eval.printResults();       

        Queue<Integer> q = new LinkedListQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        
        System.out.println(q.remove());
        System.out.println("peek" + q.element());
        System.out.println(q.remove());
        
        Tree<Integer> bst = new BinarySearchTree<>();
        
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(10);
        
        bst.delete(5);
        
        System.out.println(bst.getMax());  
        
        Vertex<Integer> v1 = new Vertex(1);
        Vertex<Integer> v2 = new Vertex(2);
        Vertex<Integer> v3 = new Vertex(3);
        Vertex<Integer> v4 = new Vertex(4);
        Vertex<Integer> v5 = new Vertex(5);
        
        v1.addVertex(v2);
        v1.addVertex(v4);
        
        v2.addVertex(v3);
        v4.addVertex(v5);
        
        BFS bfs = new BFS(v1);
        bfs.traverse();  */
        
        Vertex<Integer> v1 = new Vertex(1);
        Vertex<Integer> v2 = new Vertex(2);
        Vertex<Integer> v3 = new Vertex(3);
        Vertex<Integer> v4 = new Vertex(4);
        Vertex<Integer> v5 = new Vertex(5);
        
        v1.addVertex(v2);
        v1.addVertex(v3);
        v3.addVertex(v4);
        v4.addVertex(v5);
        
        List<Vertex> vlist = new LinkedList<>();        
        vlist.insertAtEnd(v1);
        vlist.insertAtEnd(v2);
        vlist.insertAtEnd(v3);
        vlist.insertAtEnd(v4);
        vlist.insertAtEnd(v5);
        
        DFS dfs = new DFS();
        dfs.traverse(vlist, DFS_MODE.RECURSIVE);
        
        
    }
    
}
