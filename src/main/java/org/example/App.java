/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        String name;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = input.nextLine();

        System.out.print("Hello, " + name + ", nice to meet you!");
    }
}
