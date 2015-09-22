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
    
    private TestManager()
    {
    }
    
    public String getNewQuestion()
    {
        return "";
    }
    
    public boolean tryAnswer()
    {
        return true;
    }
    
    public double getPercent()
    {
        return 1;
    }
    
    public static TestManager getInstance()
    {
        return TestManagerHolder.INSTANCE;
    }
    
    private static class TestManagerHolder
    {

        private static final TestManager INSTANCE = new TestManager();
    }
}
