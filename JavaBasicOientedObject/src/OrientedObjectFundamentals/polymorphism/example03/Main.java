/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.polymorphism.example03;

import java.awt.Image;

/**
 *
 * @author maumneto
 */
public class Main {
    public static void main(String[] args) {
        Imovel centro = new ImovelVelho(200000, 0.1);
        Imovel dunas = new ImovelNovo(400000, 0.2);
        System.out.println("Valor Dunas: " + dunas.calcularImovel());
        System.out.println("Valor Centro: " + centro.calcularImovel());
        Imovel dunasCorretor = new ImovelNovoCorretor(400000, 0.2, 0.05);
        System.out.println("Valor Dunas com corretor: " + dunasCorretor.calcularImovel());
        
    }
 
}
