package com.kodcu.question01;

/**
 * Altug Bilgin Altintas
 * email : altug@kodcu.com
 * Effective Java
 *
 * 1 - Constructor
 * 2 - Setter
 * 3 - Builder Pattern
 */

// TODO initialize the class
public class NutritionFacts {
    private final int servingSize = 0; // must
    private final int servings = 0  ; // must
    private final int calories = 0; // optional
    private final int fat = 0;  // optional
    private final int sodium = 0; // optional
    private final int carbohydrate = 0; // optional

 
    

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts();
        System.out.println(nutritionFacts);
    }
    
    
}