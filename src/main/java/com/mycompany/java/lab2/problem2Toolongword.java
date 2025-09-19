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
public class problem2Toolongword {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if(word.length() >= 10)
        {
            System.out.print(word.charAt(0)+""+(word.length()-2)+""+word.charAt(word.length()-1)); 
        }
        else
        {
            System.out.println(word);
        }
    }
}
