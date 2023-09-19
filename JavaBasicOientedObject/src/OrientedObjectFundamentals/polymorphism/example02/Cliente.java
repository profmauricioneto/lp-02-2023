/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrientedObjectFundamentals.polymorphism.example02;

/**
 *
 * @author maumneto
 */
public class Cliente extends Pessoa {
    private String cpf;
    
    public Cliente(String nome) {
        super(nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Cliente: " + getNome());
    }
}
