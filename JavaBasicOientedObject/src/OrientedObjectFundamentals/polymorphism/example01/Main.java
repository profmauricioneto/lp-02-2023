/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.polymorphism.example01;

/**
 *
 * @author maumneto
 */
public class Main {
    public static void main(String[] args) {
        ClasseA a = new ClasseB();
        a.metodo1();
        ClasseB b;
        b = (ClasseB) a;
        b.metodo3();
    }
}
