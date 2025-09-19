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
public class problem9Workhour {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter workhour: ");
        int workHour = sc.nextInt();
        System.out.print("Enter workhour on wednesday: ");
        int workHourWednesday = sc.nextInt();
        if(workHour > workHourWednesday )
        {
            int totalWorkHour = workHour*4 + workHourWednesday;
            System.out.println("Total workhour per week= "+totalWorkHour);
        }
        else
        {
           System.out.println("workhour is not greater than workhour on wednesday"); 
        }
    }
}
