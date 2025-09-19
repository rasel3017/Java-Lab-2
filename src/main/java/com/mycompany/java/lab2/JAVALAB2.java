/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.lab2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class JAVALAB2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        String symbol;
        System.out.print("Enter two number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("What operation you want to do: ");
        System.out.println("Press '+' for Summation: ");
        System.out.println("Press '-' for Subtraction: ");
        System.out.println("Press '*' for Multipication: ");
        System.out.println("Press '/' for Division: ");
        symbol = sc.next();
        switch(symbol)
        {
            case "+":
            {
                System.out.println("Sum of two number is: "+ a+b);
                break;
            }
            case "-":
            {
                System.out.println("Subtraction of two number is: "+ (a-b));
                break;
            }
            case "*":
            {
                System.out.println("Multipication of two number is: "+ a*b);
                break;
            }
            case "/":
            {
                if(b > 0) System.out.println("Sum of two number is: "+ a+b);
                else System.out.println("Division not possible!!");
            }
        }
          
    }
}
