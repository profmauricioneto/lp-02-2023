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
public class FirstReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float rad;
        float degree;
        final float PI = 3.1415f;
        System.out.print("Enter with degree value: ");
        degree = scan.nextFloat();
        
        rad = (float)degree*PI/180;
        
        System.out.println("Rad: " + rad);
    }
}
