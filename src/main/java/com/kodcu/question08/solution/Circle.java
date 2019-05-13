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
public class Circle implements Figure{
    
    private double radius; 

    public Circle(double radius) {
        this.radius = radius;
    }
   

    @Override
    public double calculateArea() {
         return Math.PI * (radius * radius);
    }
    
}
