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
public class problem3Capitalization {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(word.toUpperCase().charAt(0) + word.substring(1).toLowerCase());
    }
}
