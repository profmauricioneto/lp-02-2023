/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.templatemethod.example;

import java.util.Scanner;

/**
 *
 * @author maumneto
 */
public class MainTestCompilador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Compilador compilador;
        System.out.println("Qual o compilador quer utilizar?");
        String comp = scan.next();
        if (comp.equalsIgnoreCase("android")) {
            compilador = new AndroidCompilador();
        } else if(comp.equalsIgnoreCase("ios")) {
            compilador = new IOSCompilador(); 
        } else {
            System.out.println("Compilador não identificado.");
        }
    }
}
