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
    private TestMode mode;
    public static TestManager getInstance()
    {
        return TestManagerHolder.INSTANCE;
    }
    
    private TestManager()
    {
        mode = TestMode.ADDITION;
    }
    
    public String getNewQuestion()
    {
        switch(mode)
        {
            case ADDITION:
                return "5+3";
            case SUBTRACTION:
                return "3-2";
            default:
                return "Error: Mode not implemented";
        }
    }
    
    public boolean tryAnswer(int guess)
    {
        switch(mode)
        {
            case ADDITION:
                return 8 == guess;
            case SUBTRACTION:
                return 1 == guess;
            default:
                return false;
        }
    }
    
    public double getPercent()
    {
        return 1;
    }
    
    public void setMode(TestMode mode)
    {
        this.mode = mode;
    }
    
    private static class TestManagerHolder
    {
        private static final TestManager INSTANCE = new TestManager();
    }
}
