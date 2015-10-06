/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. rashgafdg
 */
package com.swenjproj3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author coder65535
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        boolean done = false;
        int v = 0;

        String[] right = {"Correct", "Good job", "That is correct","", "If you didnt get that right it would be a problem"};
        String[] wrong = {"Incorrect, try again", "Wrong, try again", "Check your work", "Seriously? You couldn't figure that one out?"};
        while (!done) {
            System.out.println("What would you like to do next?\n"
                               + "1) Addition\n" + "2) Subtraction\n" + "3) View Score\n" + "4) Quit");

            Scanner kbd = new Scanner(System.in);

            v = kbd.nextInt();

            switch (v) {
                case 1: {
                    //get addition problems 
                    TestManager.getInstance().setMode(TestMode.ADDITION);
                    String question = TestManager.getInstance().getNewQuestion();
                    System.out.println(question);
                    int input = kbd.nextInt();
                    kbd.nextLine();
                    while (!TestManager.getInstance().tryAnswer(input)) {
                        //handle wrong
                        System.out.println(wrong[(new Random()).nextInt(13) / 4]);
                        System.out.println(question);
                        input = kbd.nextInt();
                        kbd.nextLine();
                    }
                    System.out.println(right[(new Random()).nextInt(13) / 4]);

                    //Loop until they quit
                    break;
                }
                case 2: {
                    //get subratction problems
                    TestManager.getInstance().setMode(TestMode.SUBTRACTION);
                    String question = TestManager.getInstance().getNewQuestion();
                    System.out.println(question);
                    int input = kbd.nextInt();
                    kbd.nextLine();
                    while (!TestManager.getInstance().tryAnswer(input)) {
                        //handle wrong
                        System.out.println(wrong[(new Random()).nextInt(13) / 4]);
                        System.out.println(question);
                        input = kbd.nextInt();
                        kbd.nextLine();
                    }
                    System.out.println(right[(new Random()).nextInt(13) / 4]);

                    break;
                }
                case 3:
                    double score = TestManager.getInstance().getPercent();
                    long pct = Math.round(score);
                    System.out.println("Your accuracy is " + pct + "%");
                    break;

                case 4:
                    //quit
                    System.exit(0);

                default:
                    System.out.println("Please enter an option");
                    break;
            }
        }
    }

}
