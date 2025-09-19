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
public class Problem1_MakeAvg {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        c = sc.nextInt();
        if((a+c)%2==0)
        {
            b = (a+c)/ 2;
            System.out.println(b);
        }
        else
        {
            System.out.println("IMPOSIBLE");
        }
    }
}
