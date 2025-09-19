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
public class problem7Assignment {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = 3;
        int timetaken = 1;
        int total = number * timetaken;
        System.out.print("Press the start time: ");
        int startTime = sc.nextInt();
        if( startTime+total < 10)
        {
           System.out.println("Can complete the assainment"); 
        }
        else
        {
            System.out.println("Cannot complete the assainment");
        }
    }
}
