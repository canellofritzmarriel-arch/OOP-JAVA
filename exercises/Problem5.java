package exercises;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem5 {
    public static void main(String[] args) {
        // to accept user input
        Scanner sc= new Scanner (System.in);
        System.out.println("Input First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Input Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Expected Output");
        
        int product = num1 + num2;
        System.out.println(num1 + " * " + num2 + " = " + product);
        
    }
}
