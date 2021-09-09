package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 11 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App
{
    static double TAX = 0.055;

    public static void main( String[] args )
    {
        // scanner
        Scanner input = new Scanner(System.in);

        // get info
        System.out.print("How many euros are you exchanging? ");
        String strEuro = input.nextLine();
        System.out.print("What is the exchange rate? ");
        String strExchange = input.nextLine();

        //convert strings
        double numEuro = Integer.parseInt(strEuro);
        double numExchange = Double.parseDouble(strExchange);
        double total = numEuro * numExchange;
        total = Math.round(total * 100);
        total = total/100;

        //print summary
        System.out.print(Math.round(numEuro) + " euros at an exchange rate of " + numExchange + " is \n" + total + " U.S. dollars.");

    }
}
