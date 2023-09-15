/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.inheritance.questao05;

import java.util.Date;

/**
 *
 * @author maumneto
 */
public class Venda {
    private int codigoVenda;
    public Date data;
    public Cliente cliente;
    public Funcionario funcionario;
    
    public Venda(int codigoVenda, Cliente cliente, Funcionario funcionario) {
        this.codigoVenda = codigoVenda;
        this.cliente = cliente;
        this.funcionario = funcionario;
        data = new Date();
    }
    
    public int getCodigoVenda() {
        return codigoVenda;
    }
}
