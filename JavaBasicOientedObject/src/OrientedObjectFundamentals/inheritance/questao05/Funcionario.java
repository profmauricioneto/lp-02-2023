/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.inheritance.questao05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Funcionario extends Pessoa {

    private double salario;
    public List<Venda> vendas;
    
    public Funcionario(int codigo) {
        super(codigo);
        vendas = new ArrayList<>();
    }
    
    public Funcionario(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
        vendas = new ArrayList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void addVendaFuncionario(Venda venda) {
        vendas.add(venda);
    }
}
