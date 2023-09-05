/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.encapsulation.exemplo2;

/**
 *
 * @author maumneto
 */
public class Conta {
    private double saldo;
    
    public Conta() {
        this.saldo = 0;
    }
    
    public void depositar(double valor) {
        saldo += valor; 
    }
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insulficiente!");
        } else {
            saldo -= valor;
        }
    }
    public double consultar() {
        return saldo;
    }
}
