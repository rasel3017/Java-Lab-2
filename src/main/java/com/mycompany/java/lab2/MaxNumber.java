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
public class MaxNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 3 Number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a > b && a > c) System.out.println("Max number is: "+ a);
        else if(b > a && b > c) System.out.println("Max number is: "+ b);
        else System.out.println("Max number is: "+ c);
    }
}
