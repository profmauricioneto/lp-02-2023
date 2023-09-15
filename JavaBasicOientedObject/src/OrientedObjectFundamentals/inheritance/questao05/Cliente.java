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
public class Cliente extends Pessoa {

    private String email;
    public List<Venda> vendas;
    
    public Cliente(int codigo) {
        super(codigo);
        vendas = new ArrayList<>();

    }
    
    public Cliente(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
        vendas = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void addVendaCliente(Venda venda) {
        vendas.add(venda);
    }
}
