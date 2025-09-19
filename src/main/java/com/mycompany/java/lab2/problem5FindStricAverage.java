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
public class problem5FindStricAverage {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if( a+b > 2*c )
        {
            System.out.println("average is Strictly greater than C");
        }
        else
        {
            System.out.println("average is not Strictly greater than C");
        }
    }
}
