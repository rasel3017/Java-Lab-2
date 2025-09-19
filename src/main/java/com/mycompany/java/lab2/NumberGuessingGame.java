/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.lab2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class NumberGuessingGame {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cgNumber = (int)(Math.random()*100);//compiler generate Number
        int guess,tries=0;
        System.out.println("****Number Guessing Game****");
        do
        {
           System.out.print("Enter a guess(1-100): "); 
           guess = sc.nextInt();
           tries++;
           if(guess > cgNumber)
           {
               System.out.println("To high!!!");
           }
           else if(guess < cgNumber)
           {
               System.out.println("To low!!!");
           }
           else
           {
               System.out.println("Correct guess!!! You need "+ tries + " Tryes");
           }
        }while(guess != cgNumber);
        System.out.println("****Number Guessing Game****");
    }
}
