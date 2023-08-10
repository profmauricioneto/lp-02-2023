/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicoientedobject;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class SecondReview {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         float grade1;
         float grade2;
         float grade3;
         float result;
         
         System.out.print("Grade 01: ");
         grade1 = scan.nextFloat();
         System.out.print("Grade 02: ");
         grade2 = scan.nextFloat();
         System.out.print("Grade 03: ");
         grade3 = scan.nextFloat();
         
         result = (grade1 + grade2 + grade3)/3;
         System.out.println("Result: " + result);
         
//         if (result >= 7.0) {
//             System.out.println("Aprovado");
//         } else if (result < 4.0) {
//             System.out.println("Reprovado");
//         } else  {
//             System.out.println("Final");
//         }
         
         if (result >= 7.0) {
             System.out.println("Aprovado!");
         } else {
             if (result < 4.0) {
                 System.out.println("Reprovado!");
             } else {
                 System.out.println("Final");
                 
                 float finalGrade;
                 float finalResult;
                 System.out.print("Final Grade: ");
                 finalGrade = scan.nextFloat();
                 
                 finalResult = (result + finalGrade)/2;
                 System.out.println("Final Result: " + finalGrade);
                 
                 if (finalResult >= 5.0) {
                     System.out.println("Aprovado");
                 } else {
                     System.out.println("Reprovado");
                 }
             }
         }
         
    }
}
