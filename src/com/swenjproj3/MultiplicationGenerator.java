/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swenjproj3;

import java.util.Random;

/**
 *
 * @author Asus
 */
public class MultiplicationGenerator implements QuestionGenerator {
          int ans;

    @Override
    public String getQuestion(int min, int max)
    {
        Random rand =  new Random();
        int a = rand.nextInt(max-min+1)+min;
        int b = rand.nextInt(max-min+1)+min;
        ans = a*b;
        return "What is "+a+" X "+b+"?";
    }

    @Override
    public int getAnswer()
    {
        return ans;
    }
}
