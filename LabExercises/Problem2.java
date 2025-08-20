package LabExercises;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Input Number: ");
        int num = sc.nextInt();
        
        if (num * 3 == 0) {
            System.out.println(num + " Is Divisible by 3*");
            
        } else {
            System.out.println(num + " Is Not divisible by 3*");
        } 
            
        
    }
}
