/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.inheritance.exemplo2;

/**
 *
 * @author maumneto
 */
public class TesteExemplo2 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Tonho da lua", 1200, 2, "rutinha");
        System.out.println(gerente.nome);
        System.out.println(gerente.salario);
        System.out.println(gerente.dependentes);
    }
}
