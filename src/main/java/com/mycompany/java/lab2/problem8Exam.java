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
public class problem8Exam {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of section: ");
        int section = sc.nextInt();
        System.out.print("Enter number of students per section: ");
        int studentPersection = sc.nextInt();
        System.out.print("Enter number of students passed: ");
        int totalStudentPassed = sc.nextInt();
        int totalStudents = section * studentPersection;
        double passPercentage = (double)totalStudentPassed / totalStudents*100;
        if(passPercentage >= 50)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
