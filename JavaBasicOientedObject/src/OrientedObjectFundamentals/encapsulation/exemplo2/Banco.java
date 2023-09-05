/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.encapsulation.exemplo2;

/**
 *
 * @author maumneto
 */
public class Banco {
    public static void main(String[] args) {
        Conta bradesco = new Conta();
        System.out.println(bradesco.consultar());
        bradesco.depositar(1000);
        System.out.println(bradesco.consultar());
        bradesco.sacar(500);
        System.out.println(bradesco.consultar());
        bradesco.sacar(600);
        System.out.println(bradesco.consultar());
    }
}
