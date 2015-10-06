/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swenjproj3;

/**
 *
 * @author Asus
 */
class MathTester {
    public static void main(String[] args){
        int first = 50;
        int second = 58;
        
        Subtraction sub = new Subtraction();
        System.out.println(sub.sub(first, second));
        
        
        Addition add = new Addition();
        System.out.println(add.add(first, second));
        
        
        Questions question = new Questions();
        System.out.println(question.getQuestion(first, second));
        System.out.println(question.getAnswer());
        
        
    }
    
}
