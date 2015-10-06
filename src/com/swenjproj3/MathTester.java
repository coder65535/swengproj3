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
        int first = -50;
        int second = 58;
        
        SubtractionGenerator sub = new SubtractionGenerator();
        System.out.println(sub.getQuestion(first, second));
        System.out.println(sub.getAnswer());
        
        
        AdditionGenerator add = new AdditionGenerator();
        System.out.println(add.getQuestion(first, second));
        System.out.println(add.getAnswer());
        
        
        MultiplicationGenerator mult = new MultiplicationGenerator();
        System.out.println(mult.getQuestion(first, second));
        System.out.println(mult.getAnswer());
        
        
    }
    
}
