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
public class MatrixReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int somatorio = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Entre com o valor da matrix [%d][%d]", i, j);
                matrix[i][j] = scan.nextInt();
                if (i == j) {
                    somatorio = somatorio + matrix[i][j];
                }
            }
        }
        System.out.println("O valor da soma da diagonal principal é: " + somatorio);
    }
}
