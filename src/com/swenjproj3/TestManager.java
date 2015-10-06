/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swenjproj3;

/**
 *
 * @author coder65535
 */
public class TestManager
{
    private QuestionGenerator gen;
    private TestMode mode;
    private int hits;
    private int tries;
    public static TestManager getInstance()
    {
        return TestManagerHolder.INSTANCE;
    }
    
    public String getNewQuestion()
    {
        return gen.getQuestion(-10, 10);
    }
    
    public boolean tryAnswer(int guess)
    {
        tries++;
        if (gen.getAnswer() == guess)
        {
            hits++;
        }
        return gen.getAnswer() == guess;
    }
    
    public double getPercent()
    {
        return 100.0*hits/tries;
    }
    
    public void setMode(TestMode mode)
    {
        switch(mode)
        {
            case ADDITION:
                this.gen = new AdditionGenerator();
        }
    }
    
    private static class TestManagerHolder
    {
        private static final TestManager INSTANCE = new TestManager();
    }
}
