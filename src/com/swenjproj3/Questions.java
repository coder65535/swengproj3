/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swenjproj3;
import java.util.Random;

/**
 *
 * @author Abhijit Mayer
 */
public class Questions implements QuestionGenerator {
    
        int answer;
        Random addSubInt = new Random();
        int number;
        String operator;
        String question;
        int first;
        int second;
        
    @Override
    public String getQuestion(int min, int max) {

        number = addSubInt.nextInt();
        Random firstnum = new Random();
        Random secondnum = new Random();
        first = addSubInt.nextInt(min);
        second = addSubInt.nextInt(max);
        
        
        
        
     if (number >0) {
         question = (first + " - " + second+"?");
     } else {
         question = (first + " + " + second+"?");
     }
     return question;
    }

    @Override
    public int getAnswer() {
        
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        
          if (number >0) {
              answer = answer = sub.sub(first, second);
         
     } else {
            answer = add.add(first, second)  ;
     }
        
        return answer;

    }
    
}
