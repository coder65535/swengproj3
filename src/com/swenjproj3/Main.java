/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. rashgafdg
 */
package com.swenjproj3;

import java.util.Scanner;

/**
 *
 * @author coder65535
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean done = false;
        int v = 0;

        while (!done) {
            System.out.println("What would you like to do next?\n"
                    + "1) Addition\n" + "2) Subtraction\n" + "3) View Score\n" + "4) Quit");

            Scanner kbd = new Scanner(System.in);

            v = kbd.nextInt();

            switch (v) {
                case 1:
                    //get addition problems 
                    TestManager.getInstance().setMode(TestMode.ADDITION);
                    String question = TestManager.getInstance().getNewQuestion();
                    System.out.println(question);
                    int input = kbd.nextInt();
                    kbd.nextLine();
                    while(!TestManager.getInstance().tryAnswer(input))
                    {
                        //handle wrong
                        System.out.println("Wrong");
                        input = kbd.nextInt();
                        kbd.nextLine();
                    }
                    System.out.println("Right");
                    
                    //Loop until they quit
                    break;
                case 2:
                    //get subratction problems
                    TestManager.getInstance().setMode(TestMode.SUBTRACTION);
                    System.out.println("What is x - y");

                    break;

                case 3:
                    double score = TestManager.getInstance().getPercent()*100;
                    long pct = Math.round(score);
                    System.out.println("Your accuracy is "+pct+"%");
                    break;

                case 4:
                    //quit
                    break;

                default:
                    System.out.println("");
                    break;
            }
        }
    }

}
