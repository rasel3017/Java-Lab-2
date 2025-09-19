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
public class problem4FindtheoddOne {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if((a == b) && (a != c))
        {
            System.out.println(c);
        }
        else if((a == c) && (a != b))
        {
            System.out.println(b);
        }
        else if((b == c) && (b != a))
        {
            System.out.println(a);
        }
        else if((a != b) && (a != c) && (b != c))
        {
            System.out.println("all odd number");
        }
        else
        {
            System.out.println("no odd number");
        }
    }
}
