/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.polymorphism.example02;

/**
 *
 * @author maumneto
 */
public class MainTest {
    public static void main(String[] args) {
        Pessoa p1 = new Funcionario("Arex");
        Funcionario p2 = (Funcionario) p1;
        p1.imprimir();
    }
}
