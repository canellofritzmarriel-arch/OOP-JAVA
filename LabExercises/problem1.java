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
public class problem1 {
    public static void main(String[] args) {
        //TODO code application logic here 
       Scanner sc= new Scanner ( System.in);
       
        System.out.println("Input Number: ");
        int num  = sc.nextInt ();
        if ( num > 0) {
            System.out.println(num + " Is Positive");
            
        }
    }
}
