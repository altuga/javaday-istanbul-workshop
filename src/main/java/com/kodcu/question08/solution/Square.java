/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kodcu.question08.solution;

/**
 *
 * @author altuga
 */
public class Square implements Figure{

    
    private int edge;

    public Square(int edge) {
        this.edge = edge;
    }
    
    
    
    @Override
    public double calculateArea() {
        return edge * edge ;
               
    }
    
}
