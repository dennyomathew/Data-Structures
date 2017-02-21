/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.app;

import datastructures.stack.LinkedListStack;
import datastructures.stack.Stack;

/**
 * Simple expression evaluator using Stack
 * 
 * 
 * @author Denny Oommen Mathew <denny@dennymathew.com>
 */
public class DijkstraExpEvaluator {
    
    private Stack<Double> valueStack = null;

    public DijkstraExpEvaluator() {
        this.valueStack = new LinkedListStack<>();        
    }
    
    public void evaluateExp(String exp) {
        
        Stack<String> operStack =  new LinkedListStack<>(); 
        
        String[] tokens = exp.split(" ");
        
        for(String token : tokens) {
            switch(token) {
                case "(" :  break;
                case "+" :
                case "*" :
                case "/" :
                case "-" :  operStack.push(token);
                            break;
                case ")":   valueStack.push(doMath(valueStack.pop(), valueStack.pop(), operStack.pop()));
                            break;
                default: valueStack.push(Double.parseDouble(token));
                                  
            }
        }         
    }
    
    private Double doMath(Double x, Double y, String operation) {
        switch (operation) {
            case "+":   return(x + y);
            case "*":   return(x * y);
            case "/":   return(x / y);
            case "-":   return(x - y);       
            default:    return 0.0;
        }
    }

    public void printResults() {
        System.out.println(valueStack.pop());
    }
    
    
}
